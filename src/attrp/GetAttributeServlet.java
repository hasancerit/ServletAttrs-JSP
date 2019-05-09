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
		//Context Attribute old. i�in t�m thread ve servlet s�n�flar�ndan getServletContext() ile ula��labilrler
		ServletContext context = req.getServletContext();
		String myContextAttr = (String) context.getAttribute("ContextAttr");
		System.out.println(myContextAttr);//Di�er servletta atad��m�z context attribute'a bu servlettan ula�abildik.
		
		//SESSION ATTRIBUTES
		//Sessionlar ileride!
		HttpSession session = req.getSession();
		String mySessionAttr = (String) session.getAttribute("SessionAttr");
		System.out.println(mySessionAttr);//Ayn� Browser'dan eri�ebildik. Farkl� Browserlardan eri�emedik.

		//REQUEST ATTRIBUTES
		System.out.println(""+req.getAttribute("RequestAttr"));//Di�er thread ve servlet'lardan eri�ilemez.
	}
}
