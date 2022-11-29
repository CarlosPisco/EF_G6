package Daos;

import Beans.TipoUsuario;
import Beans.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao extends DaoBase{
    public Usuario loginUsuario(String username, String password){

        Usuario usuario = new Usuario();

        //Comparar primero con la tabla de usuarios
        //antes del sql se debe hashear el password para comparar los hashes
        String sql = "select * from Usuarios where correo=? and contrasenia=sha2(?,512)";
        try (Connection connection = this.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int idUsuario = rs.getInt(1);
                    usuario=buscarPorId(idUsuario);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return usuario;
    }

    public Usuario buscarPorId(int idUsuario){
        Usuario usuario = new Usuario();

        String sql = "select u.idUsuarios, u.nombre, u.apellido, u.correo, tu.idTipoUsuario, tu.tipoUsuario\n" +
                "from Usuarios u inner join TipoUsuario tu on u.idTipoUsuario=tu.idTipoUsuario where idUsuarios=?;";

        try(Connection connection = this.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setInt(1, idUsuario);
            try(ResultSet rs = pstmt.executeQuery()){
                if (rs.next()) {
                    usuario.setIdUsuario(rs.getInt(1));
                    usuario.setNombre(rs.getString(2));
                    usuario.setApellido(rs.getString(3));
                    usuario.setCorreo(rs.getString(4));
                    TipoUsuario tu = new TipoUsuario();
                    tu.setIdTipoUsuario(rs.getInt(5));
                    tu.setTipoUsuario(rs.getString(6));
                    usuario.setTipoUsuario(tu);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

}
