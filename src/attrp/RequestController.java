package attrp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Kisi kisi1 = new Kisi("Hasan","Cerit","20");
		Kisi kisi2 = new Kisi("Deniz","Ýnan","20");
		Kisi kisi3 = new Kisi("Osman","Kýzýlcýk","54");
		
		List<Kisi> kisiler = new ArrayList<Kisi>();
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		
		req.setAttribute("KisiList",kisiler);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("JSPs/firstJsp.jsp");
		dispatcher.forward(req, resp);
	}
}
