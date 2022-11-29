package Daos;

import Beans.CorteLaser;
import Beans.EscaneoDigital;
import Beans.Impresion3D;
import Beans.Usuario;

import java.sql.*;
import java.util.ArrayList;

public class ServicioDao extends DaoBase{
    public void reistrarCorteLaser(CorteLaser corteLaser){
        String sql = "INSERT INTO CorteLaser(idGrosorLinea, idColorLinea, idMaterial, alto, ancho, urlImagen, fecha) values (?,?,?,?,?,?,now())";

        try (Connection connection = this.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, corteLaser.getGrosorLinea().getIdGrosorLinea());
            pstmt.setInt(2, corteLaser.getColorLinea().getIdColorLinea());
            pstmt.setInt(3, corteLaser.getMaterial().getIdMaterial());
            pstmt.setDouble(4, corteLaser.getAlto());
            pstmt.setDouble(5, corteLaser.getAncho());
            pstmt.setString(6, corteLaser.getUrlImagen());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void reistrarEscaneoDigital(EscaneoDigital escaneoDigital){
        String sql = "INSERT INTO CorteLaser(largo, ancho, altura, idResolucion) values (?,?,?,?,now())";

        try (Connection connection = this.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setDouble(1, escaneoDigital.getLargo());
            pstmt.setDouble(2, escaneoDigital.getAncho());
            pstmt.setDouble(3, escaneoDigital.getAltura());
            pstmt.setInt(4, escaneoDigital.getResolucion().getIdResolucion());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void reistrarImpresion3D(Impresion3D impresion3D){
        String sql = "INSERT INTO CorteLaser(idDensidadPieza, idGrosor, idAltura, idMaterial, autoservicio, urlImagen, fecha) values (?,?,?,?,?, ?, now())";

        try (Connection connection = this.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, impresion3D.getDensidadPieza().getIdDensidadPieza());
            pstmt.setInt(2, impresion3D.getGrosor().getIdGrosor());
            pstmt.setInt(3, impresion3D.getAltura().getIdAltura());
            pstmt.setInt(4, impresion3D.getMaterial3D().getIdMaterial3D());
            pstmt.setBoolean(5, impresion3D.getAutoservicio());
            pstmt.setString(6, impresion3D.getUrlImagen());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
