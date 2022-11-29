package Daos;

import Beans.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CorteLaserDao extends DaoBase{
    public ArrayList<Material> obtenerMaterial(){

        ArrayList<Material> Materiales = new ArrayList<>();

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery( "SELECT * FROM Material");){

            while (rs.next()) {
                Material material = new Material();
                material.setIdMaterial(rs.getInt(1));
                material.setMaterial(rs.getString(2));
                Materiales.add(material);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Materiales;
    }

    public ArrayList<ColorLinea> obtenerColores(){

        ArrayList<ColorLinea> colores = new ArrayList<>();

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery( "SELECT * FROM ColorLinea");){

            while (rs.next()) {
                ColorLinea color = new ColorLinea();
                color.setIdColorLinea(rs.getInt(1));
                color.setColorLinea(rs.getString(2));
                colores.add(color);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return colores;
    }

    public ArrayList<GrosorLinea> obtenerGrosor(){

        ArrayList<GrosorLinea> grosor = new ArrayList<>();

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery( "SELECT * FROM GrosorLinea");){

            while (rs.next()) {
                GrosorLinea grosorLinea = new GrosorLinea();
                grosorLinea.setIdGrosorLinea(rs.getInt(1));
                grosorLinea.setGrosorLinea(rs.getString(2));
                grosor.add(grosorLinea);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return grosor;
    }
}
