package Servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SessionServlet", value = "/SessionServlet")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EmpleadoDao empleadoDao = new EmpleadoDao();
        HttpSession session = request.getSession();



        String accion = request.getParameter("accion") == null ? "login" : request.getParameter("accion");

        switch (accion){

            case("login"):

                String usuario = request.getParameter("usuario");
                String password = request.getParameter("password");

                Empleado empleado = empleadoDao.loginEmpleado(dni,password);

                if(empleado!=null){
                    //System.out.println("hola");
                    session.setAttribute("EmpLogueo",empleado);
                    //session.setMaxInactiveInterval(10*60);

                    if(empleado.getRol().equals("gestor") || empleado.getRol().equals("vendedor")){
                        response.sendRedirect(request.getContextPath() + "/CarteleraServlet");

                    }else if (empleado.getRol().equals("admin")) {
                        response.sendRedirect(request.getContextPath() + "/ReportesServlet");

                    }



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
