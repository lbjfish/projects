package com.lee6.seckill.web;

import java.util.Date;
import java.util.List;

import com.lee6.seckill.dto.Exposer;
import com.lee6.seckill.dto.SeckillExecution;
import com.lee6.seckill.dto.SeckillResult;
import com.lee6.seckill.entity.Seckill;
import com.lee6.seckill.enums.SeckillStatEnum;
import com.lee6.seckill.exception.RepeatKillException;
import com.lee6.seckill.exception.SeckillCloseException;
import com.lee6.seckill.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.soap.Addressing;

@Controller  //@Service @Component
@RequestMapping("/seckill")  //url:/模块/资源/{id}/细分/seckill/list
public class SeckillController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SeckillService seckillService;
	
	/**
	 * 秒杀列表页
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String List(Model model){
		//获取列表页
		List<Seckill> list = seckillService.getSeckillList();
		model.addAttribute("list", list);
		//list.jsp + model = ModelAndView
		return "list";  //WEB-INF/jsp/list.jsp
	}
	
	/**
	 * 秒杀详情页
	 *         @PathVariable("seckillId")注解可以不写，spring会自动识别"/{seckillId}/detail",为了更让以后容易看懂所有写上
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/{seckillId}/detail",method = RequestMethod.GET)
	public String detail(@PathVariable("seckillId") Long seckillId,Model model){
		if(seckillId == null){
			return "redirect:/seckill/list";
		}
		Seckill seckill = seckillService.getById(seckillId);
		if(seckill == null){
			return "forward:/seckill/list";  //应该用redirect 但是为了展示重定向和转发，这里用forward也没关系
		}
		model.addAttribute("seckill", seckill);
		return "detail";
	}
	
	/**
	 * 用来输出秒杀地址接口
	 * ajax json
	 * 			@PathVariable("seckillId")注解可以不写，spring会自动识别"/{seckillId}/detail",为了更让以后容易看懂所有写上
	 * produces = {"application/json;charset=UTF-8"}为了解决json数据里的中文可能会有乱码问题
	 * @param seckillId
	 * @return
	 */
	@RequestMapping(value = "/{seckillId}/exposer",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public SeckillResult<Exposer> exposer(@PathVariable("seckillId") Long seckillId){
		SeckillResult<Exposer> result;
		try{
			Exposer exposer = seckillService.exportSeckillUrl(seckillId);
			result = new SeckillResult<Exposer>(true, exposer);
		}catch(Exception e){
			logger.error(e.getMessage(),e);
			result = new SeckillResult<Exposer>(false,e.getMessage());
		}
		return result;
	}
	
	/**
	 * 执行秒杀接口
	 *          @CookieValue(value= "killPhone",required = false),如果spring发现没有传过来cookie，会报错，required = false会忽略这个错误，然后到程序里处理这个问题
	 * @param seckillId
	 * @param md5
	 * @param phone
	 * @return
	 */
	@RequestMapping(value = "/{seckillId}/{md5}/execution",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public SeckillResult<SeckillExecution> execute(@PathVariable("seckillId")Long seckillId,
												   @PathVariable("md5")String md5,
												   @CookieValue(value= "killPhone",required = false)Long phone){
		if(phone == null){
			return new SeckillResult<SeckillExecution>(false,"未注册");
		}
		try{
			SeckillExecution execution = seckillService.executeSeckill(seckillId, phone, md5);
			return new SeckillResult<SeckillExecution>(true,execution);
		}catch(RepeatKillException e1){
			SeckillExecution execution = new SeckillExecution(seckillId,SeckillStatEnum.REPEAT_KILL);
			return new SeckillResult<SeckillExecution>(false,execution);
		}catch(SeckillCloseException e2){
			SeckillExecution execution = new SeckillExecution(seckillId,SeckillStatEnum.END);
			return new SeckillResult<SeckillExecution>(false,execution);
		}catch(Exception e){
			logger.error(e.getMessage(), e);
			SeckillExecution execution = new SeckillExecution(seckillId,SeckillStatEnum.INNER_ERROR);
			return new SeckillResult<SeckillExecution>(false,execution);
		}
	}
	
	/**
	 * 返回系统当前时间（非秒杀用户自己电脑时间）
	 * @return
	 */
	@RequestMapping(value = "/time/now",method = RequestMethod.GET)
	@ResponseBody
	public SeckillResult<Long> time(){
		Date now = new Date();
		return new SeckillResult(true,now.getTime());
	}
	
}
