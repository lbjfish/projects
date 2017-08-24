package tag;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateTag extends SimpleTagSupport{
	private String pattern;
	public void setPattern(String pattern){
		this.pattern=pattern;
	}

	@Override
	public void doTag() throws JspException,IOException{
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		PageContext ctx = (PageContext) getJspContext();
		JspWriter out = ctx.getOut();
		out.println(sdf.format(new Date()));
	}
}
