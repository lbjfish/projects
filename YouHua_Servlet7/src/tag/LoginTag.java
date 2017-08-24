package tag;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class LoginTag extends SimpleTagSupport{
	private String u;
	
	public void setU(String u) {
		this.u = u;
	}

	@Override
	public void doTag() throws JspException,IOException{
		PageContext ctx = (PageContext) getJspContext();
		HttpServletResponse response = (HttpServletResponse) ctx.getResponse();
		response.sendRedirect(u);
	}
}