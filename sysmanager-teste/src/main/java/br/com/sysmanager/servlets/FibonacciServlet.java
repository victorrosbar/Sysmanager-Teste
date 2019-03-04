package br.com.sysmanager.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sysmanager.objects.SequenciaFibonacci;

@WebServlet("/fibonacci")
public class FibonacciServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		SequenciaFibonacci fibo = new SequenciaFibonacci();
		StringBuilder seqFibo = fibo.fibonacciFinal(Integer.parseInt(req.getParameter("numeroFinal")));
		
		req.setAttribute("seqFibo", seqFibo);
		
		RequestDispatcher rd = req.getRequestDispatcher("/respostaFibonacci.jsp");
		rd.forward(req, resp);
		
	}
	
}
