package br.com.sysmanager.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sysmanager.objects.NumerosPrimos;

@WebServlet("/numerosPrimos")
public class NumeroPrimoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		NumerosPrimos np = new NumerosPrimos();
		int resposta = np.maiorPrimo(Integer.parseInt(req.getParameter("numero1")), Integer.parseInt(req.getParameter("numero2")));
		
		req.setAttribute("resposta", resposta);
		
		RequestDispatcher rd = req.getRequestDispatcher("/respostaMaiorNumeroPrimo.jsp");
		rd.forward(req, resp);
		
		
	}
	
	
	
		

	

}
