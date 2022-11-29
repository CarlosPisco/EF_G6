package Servlets;

import Beans.Impresion3D;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServicioServlet", value = "/ServicioServlet")
public class ServicioServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion") == null ? "listar" : request.getParameter("accion");
        RequestDispatcher view;
        //Dao para la lista

        switch (accion){

            case("listar"):

                    //lista que se envia como parámetro

                view = request.getRequestDispatcher("/employee/listaEmployees.jsp");
                view.forward(request, response);

                break;



        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String accion = request.getParameter("accion") == null ? "listar" : request.getParameter("accion");
        RequestDispatcher view;
        switch (accion){
            case ("registrar"):

                if(request.getParameter("tipoServicio").equalsIgnoreCase("Impresion3D")){
                    view = request.getRequestDispatcher("/Servicio/Impresion3D.jsp");
                    view.forward(request, response);
                }else if(request.getParameter("tipoServicio").equalsIgnoreCase("CorteLaser")) {
                view = request.getRequestDispatcher("/Servicio/CorteLaser.jsp");
                view.forward(request, response);
                }else if(request.getParameter("tipoServicio").equalsIgnoreCase("EscaneoDigital")) {
                    view = request.getRequestDispatcher("/Servicio/EscaneoDigital.jsp");
                    view.forward(request, response);

                }

                break;

            case("Impresion3D"):
                Impresion3D impresion3D = new Impresion3D();

                int densidad = Integer.parseInt(request.getParameter("densidad"));


                // se reciben los datos del registro y se le mandan al resumen para calcular el costo
                view = request.getRequestDispatcher("/Servicio/Resumen.jsp");
                view.forward(request, response);
                break;


            case("CorteLaser"):
                // se reciben los datos del registro y se le mandan al resumen para calcular el costo
                view = request.getRequestDispatcher("/Servicio/Resumen.jsp");
                view.forward(request, response);
                break;


            case("EscaneoDigital"):

                // se reciben los datos del registro y se le mandan al resumen para calcular el costo
                view = request.getRequestDispatcher("/Servicio/Resumen.jsp");
                view.forward(request, response);
                break;

        }

    }
}
