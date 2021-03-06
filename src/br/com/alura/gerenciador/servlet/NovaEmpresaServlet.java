package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public NovaEmpresaServlet() {
        // TODO Auto-generated constructor stub
    }

	
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
    		throws IOException{
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = req.getParameter("nome");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body> Empresa " + nomeEmpresa  + " cadastrada com sucesso! </body></html>");
	}

}
