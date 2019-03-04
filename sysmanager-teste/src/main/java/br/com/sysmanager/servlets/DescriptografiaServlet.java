package br.com.sysmanager.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sysmanager.objects.Criptografia;

@WebServlet("/descriptografia")
public class DescriptografiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Criptografia descripto = new Criptografia();
		String textoDescriptografado = descripto.descriptografarASCII(req.getParameter("descriptografarTexto"));

		req.setAttribute("textoDescriptografado", textoDescriptografado);

		RequestDispatcher rd = req.getRequestDispatcher("/textoDescriptografado.jsp");
		rd.forward(req, resp);
	}

}
