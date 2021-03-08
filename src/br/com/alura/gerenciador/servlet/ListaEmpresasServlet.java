package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    		throws IOException, ServletException{
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		req.setAttribute("empresas", lista);
		RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas.jsp");
		rd.forward(req, resp);
	}

}
