package taglib.custom;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ShowIP extends TagSupport {
	private static final long serialVersionUID = 9110895617959019390L;
	@Override
	public int doStartTag() { 
		HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();
		JspWriter out = pageContext.getOut();
		String ip = request.getRemoteAddr();
		System.out.println(ip);
		try {
			out.print(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
}    
