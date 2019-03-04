package br.com.sysmanager.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sysmanager.objects.Criptografia;

@WebServlet("/criptografia")
public class CriptografiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Criptografia cripto = new Criptografia();
		String textoCriptografado = cripto.criptografarASCII(req.getParameter("criptografarTexto"));
		//cripto.descriptografarASCII(req.getParameter("descriptografarTexto"));
		
		req.setAttribute("textoCriptografado", textoCriptografado);
		
		//int resposta = cripto.maiorPrimo(Integer.parseInt(req.getParameter("numero1")), Integer.parseInt(req.getParameter("numero2")));
		
		//req.setAttribute("resposta", resposta);
		
		RequestDispatcher rd = req.getRequestDispatcher("/textoCriptografado.jsp");
		rd.forward(req, resp);
	}

}
