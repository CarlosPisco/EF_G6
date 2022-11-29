package Daos;

import Beans.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EscaneoDigitalDao extends DaoBase{
    public ArrayList<Resolucion> obtenerResolucion(){

        ArrayList<Resolucion> resoluciones = new ArrayList<>();

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery( "SELECT * FROM Resolucion");){

            while (rs.next()) {
                Resolucion resolucion = new Resolucion();
                resolucion.setIdResolucion(rs.getInt(1));
                resolucion.setResolucion(rs.getString(2));
                resoluciones.add(resolucion);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resoluciones;
    }
}
