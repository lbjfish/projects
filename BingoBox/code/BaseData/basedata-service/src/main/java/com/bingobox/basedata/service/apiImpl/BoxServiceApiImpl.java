package com.bingobox.basedata.service.apiImpl;

import com.bingobox.basedata.dao.BoxDao;
import com.bingobox.basedata.dto.BoxDTO;
import com.bingobox.basedata.po.BoxPO;
import com.bingobox.basedata.service.api.BoxServiceApi;
import com.bingobox.framework.util.BingoBoxBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/8.
 */
@Service("boxServiceApi")
public class BoxServiceApiImpl implements BoxServiceApi {

    @Autowired
    private BoxDao boxDao;

    @Override
    public BoxDTO getBoxById(Long boxId) throws Exception {
        BoxPO boxPO = new BoxPO();
        boxPO.setBoxId(boxId);
        BoxPO temp = boxDao.getBoxById(boxId);
        BoxDTO boxDTO = BingoBoxBeanUtils.generatorObject(temp, BoxDTO.class);
        return boxDTO;
    }

    @Override
    public List<BoxDTO> listBoxByParam(BoxDTO boxDTO) throws Exception {
        BoxPO boxPO = BingoBoxBeanUtils.generatorObject(boxDTO, BoxPO.class);
        List<BoxPO> boxPOs = boxDao.listBoxByParam(boxPO);
        List<BoxDTO> boxDTOs = BingoBoxBeanUtils.generatorList(boxPOs, BoxDTO.class);
        return boxDTOs;
    }
}
