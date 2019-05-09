package attrp;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetAttributeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//CONTEXT ATTRIBUTES
		//Context Attribute old. için tüm thread ve servlet sýnýflarýndan getServletContext() ile ulaþýlabilrler
		ServletContext context = req.getServletContext();
		String myContextAttr = (String) context.getAttribute("ContextAttr");
		System.out.println(myContextAttr);//Diðer servletta atadðýmýz context attribute'a bu servlettan ulaþabildik.
		
		//SESSION ATTRIBUTES
		//Sessionlar ileride!
		HttpSession session = req.getSession();
		String mySessionAttr = (String) session.getAttribute("SessionAttr");
		System.out.println(mySessionAttr);//Ayný Browser'dan eriþebildik. Farklý Browserlardan eriþemedik.

		//REQUEST ATTRIBUTES
		System.out.println(""+req.getAttribute("RequestAttr"));//Diðer thread ve servlet'lardan eriþilemez.
	}
}
