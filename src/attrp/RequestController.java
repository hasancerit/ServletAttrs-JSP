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
		
		req.setAttribute("KisiList",kisiler);//Kisileri request scope alanýnda attribute'e atadýk
		
		/*Dispatcher, yönlendiricidir. Redirect'ten farklar;
		 *1-forward metodunda url degismez , sendRedirect metodunda url degisir.
		 *2-Dispatch islemi  server’da olur , Redirect islemi ise client’ta olur.
		 *3-Redirect islemini soyle dusunebiliriz ; musteri bir problemle karsilasti ve sizi aradi siz bu isten ben sorumlu 
		 *degilim diyerek musteriyi farkli bir kisiye yonlendiriyorsunuz. (url degisir)
		 *4-Dispatch islemi ise ; musterinin karsilastigi problemi cozerken calisma arkadasinizdan yardim aliyorsunuz arka 
		 *planda isin sizin yaptiginiz sanilirken aslinda calisma arkadasiniz bu isi yapmaktadir. 
		 *Musterinin bundan haberi yoktur.( url degismez)*/
		RequestDispatcher dispatcher = req.getRequestDispatcher("JSPs/firstJsp.jsp");
		//Dispatcherý reqten çekersek, Relative Path ile dosyalara ulaþabiliriz.
		//Dispatcherý Servlet Contextten çekersel Absolute path ile dosyalara ulaþabiliriz.
		dispatcher.forward(req, resp);//Yönlendirme yapýldý.
	}
}
