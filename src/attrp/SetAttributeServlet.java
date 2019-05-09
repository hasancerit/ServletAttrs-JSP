package attrp;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SetAttributeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//CONTEXT ATTR
		ServletContext context = req.getServletContext();
		context.setAttribute("ContextAttr", "myContextAttr");
		
		//SESSÝON ATTR
		HttpSession session = req.getSession();
		session.setAttribute("SessionAttr", "mySessionAttr");
		
		//REQUEST ATTR
		req.setAttribute("RequestAttr", "myReqAttr");
		System.out.println(""+req.getAttribute("RequestAttr"));//Kendi servlet ve kendi threadimizden eriþebiliriz.
	}
}
