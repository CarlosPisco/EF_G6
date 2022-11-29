package Daos;

import Beans.TipoServicio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TipoServicioDao extends DaoBase{
    public ArrayList<TipoServicio> obtenerTipoServicios(){

        ArrayList<TipoServicio> tipoServicios = new ArrayList<>();

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery( "SELECT * FROM TipoServicio");){

            while (rs.next()) {
                TipoServicio ts = new TipoServicio();
                ts.setIdTipoServicio(rs.getInt(1));
                ts.setTipoServicio(rs.getString(2));
                tipoServicios.add(ts);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipoServicios;
    }
}
