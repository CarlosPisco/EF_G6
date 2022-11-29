package Servlets;

import Beans.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sun.util.resources.cldr.ext.TimeZoneNames_ps_PK;

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

                DensidadPieza dp =  new DensidadPieza();
                int densidad = Integer.parseInt(request.getParameter("densidad"));
                dp.setDensidadPieza(densidad);
                impresion3D.setDensidadPieza(dp);

                Grosor Grosor = new Grosor();
                String grosor = request.getParameter("grosor");
                Grosor.setGrosor(grosor);
                impresion3D.setGrosor(Grosor);

                Altura Altura = new Altura();
                double altura = Double.parseDouble(request.getParameter("alturaCapa"));
                Altura.setAltura(altura);
                impresion3D.setAltura(Altura);

                Material3D Material3D = new Material3D();
                String material3d = request.getParameter("Material");
                Material3D.setMaterial3D(material3d);
                impresion3D.setMaterial3D(Material3D);

                String autoserv = request.getParameter("autoservicio");
                boolean autoServicio = false;
                if(autoserv.equals("si")){
                    autoServicio = true;
                }
                impresion3D.setAutoservicio(autoServicio);

                impresion3D.setUrlImagen(request.getParameter("urlImagen"));


                request.setAttribute("impresion3D",impresion3D);


                // se reciben los datos del registro y se le mandan al resumen para calcular el costo
                view = request.getRequestDispatcher("/Servicio/Resumen.jsp");
                view.forward(request, response);
                break;


            case("CorteLaser"):
                // se reciben los datos del registro y se le mandan al resumen para calcular el costo

                CorteLaser corteLaser = new CorteLaser();

                GrosorLinea GrosorLinea = new GrosorLinea();
                String grosorlinea = request.getParameter("grosor");
                GrosorLinea.setGrosorLinea(grosorlinea);
                corteLaser.setGrosorLinea(GrosorLinea);

                ColorLinea colorLinea = new ColorLinea();
                String colorlinea = request.getParameter("color");
                colorLinea.setColorLinea(colorlinea);
                corteLaser.setColorLinea(colorLinea);

                Material Material = new Material();
                String material = request.getParameter("material");
                Material.setMaterial(material);
                corteLaser.setMaterial(Material);




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
