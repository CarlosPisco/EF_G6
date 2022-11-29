package Daos;

import Beans.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Impresion3DDao extends DaoBase{
    public ArrayList<Material3D> obtenerMaterial3D(){

        ArrayList<Material3D> materiales = new ArrayList<>();

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery( "SELECT * FROM Material3D");){

            while (rs.next()) {
                Material3D m3d = new Material3D();
                m3d.setIdMaterial3D(rs.getInt(1));
                m3d.setMaterial3D(rs.getString(2));
                materiales.add(m3d);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return materiales;
    }

    public ArrayList<Grosor> obtenerGrosor(){

        ArrayList<Grosor> grosors = new ArrayList<>();

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery( "SELECT * FROM Grosor");){

            while (rs.next()) {
                Grosor grosor = new Grosor();
                grosor.setIdGrosor(rs.getInt(1));
                grosor.setGrosor(rs.getString(2));
                grosors.add(grosor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return grosors;
    }

    public ArrayList<Altura> obtenerAltura(){

        ArrayList<Altura> alturas = new ArrayList<>();

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery( "SELECT * FROM Altura");){

            while (rs.next()) {
                Altura altura = new Altura();
                altura.setIdAltura(rs.getInt(1));
                altura.setAltura(rs.getDouble(2));
                alturas.add(altura);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return alturas;
    }

    public ArrayList<DensidadPieza> obtenerDensidad(){

        ArrayList<DensidadPieza> densidades = new ArrayList<>();

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery( "SELECT * FROM DensidadPieza");){

            while (rs.next()) {
                DensidadPieza dp = new DensidadPieza();
                dp.setIdDensidadPieza(rs.getInt(1));
                dp.setDensidadPieza(rs.getInt(2));
                densidades.add(dp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return densidades;
    }
}
