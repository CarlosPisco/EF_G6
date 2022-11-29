package Servlets;

import Beans.Usuario;
import Daos.UsuarioDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SessionServlet", value = "/SessionServlet")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String accion = request.getParameter("accion") == null ? "iniciar" : request.getParameter("accion");
        RequestDispatcher view;
        UsuarioDao uDao = new UsuarioDao();
        switch (accion) {
            case ("iniciar"):
                HttpSession session1 = request.getSession();
                if (session1.getAttribute("UsuLogueo") == null) {
                    view = request.getRequestDispatcher("/Inicio/Login.jsp");
                    view.forward(request, response);
                } else {
                    response.sendRedirect(request.getContextPath() + "/ServicioServlet");
                }
        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UsuarioDao uDao = new UsuarioDao();
        HttpSession session = request.getSession();



        String accion = request.getParameter("accion") == null ? "login" : request.getParameter("accion");

        switch (accion){

            case("login"):

                String usuario = request.getParameter("usuario");
                String password = request.getParameter("password");

                Usuario usuario1 = uDao.loginUsuario(usuario,password);

                if(usuario1!=null){
                    //System.out.println("hola");
                    session.setAttribute("UsuLogueo",usuario1);
                    //session.setMaxInactiveInterval(10*60);
                    response.sendRedirect(request.getContextPath() + "/ServicioServlet");
                }else {
                    session.setAttribute("msg","La credenciales son incorrectas");
                    RequestDispatcher view = request.getRequestDispatcher("/Inicio/Login.jsp");
                    view.forward(request,response);
                }
                break;

            case ("registrar"):




                break;

        }
    }
}
