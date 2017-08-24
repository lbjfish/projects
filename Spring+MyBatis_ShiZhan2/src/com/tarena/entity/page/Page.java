package com.tarena.entity.page;

public class Page {
	//当前客户选择的页码
	private int page=1;
	//每一页的条数
	private int pageSize=5;
	
	//由于SQL中的表达式不让直接运算，
	//所以在类中算出来给SQL使用  (在Cost.xml)
	private int start;
	private int end;
	  
	private int rows;        //总行数
	private int pageTotol;  //有几页
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	//sql中的表达式要访问类中的属性，一定时通过get方法访问，所以可以在get方法中将start end算出来
	public int getStart() {
		start = (page-1)*pageSize+1;
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		end = page*pageSize;
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	/**
	 * 页面调用totalPage属性时，是通过该get方法调用的。
	 * 在调用该方法时，计算出totalPage的值。
	 * 此计算需要依赖rows条件，而这个条件需要在页面使用
	 * totalPage属性之前传入到当前对象。
	 */
	public int getPageTotol() {
		if(rows%pageSize==0){
			pageTotol = rows/pageSize;
		}else{
			pageTotol = (rows/pageSize)+1;
		}
		return pageTotol;
	}
	public void setPageTotol(int pageTotol) {
		this.pageTotol = pageTotol;
	}
	
}
