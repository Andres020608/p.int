package Modelo;

import Db.connection;
import Vista.VistaLogin;
import Vista.paginaInicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Controlador.LoginControlador;

public class Login {
    protected int Rol;
    protected String Usuario;
    protected String Contraseña;

    
    paginaInicio inicio = new paginaInicio();
    VistaLogin vistaLogin = new VistaLogin();
    LoginControlador loginControlador = new LoginControlador();
    public int getRol() {
        return Rol;
    }

    public void setRol(int Rol) {
        this.Rol = Rol;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    public void setPaginaInicio(paginaInicio inicio){
        this.inicio = inicio;
    }
    
    public void verificacionUsuario(Login login) {

        String usuario = getUsuario();
        String contraseña = getContraseña();
        int rol = getRol();

        Connection con = connection.getConnection();

        String sql = "SELECT * FROM usuario WHERE nombre_usuario = ? AND password = ? AND tipo_usuario_id_tipo_usua = ?";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, usuario);
            statement.setString(2, contraseña);
            statement.setInt(3, rol);
            System.out.println("Usuario: " + usuario);
            System.out.println("Contraseña: " + contraseña);
            System.out.println("Rol: " + rol);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Usuario validado correctamente");
                inicio.setVistaLogin(vistaLogin);
                inicio.setVisible(true);
                inicio.setSize(800, 500);
                inicio.setLocation(0, 0);
                vistaLogin.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "El usuario, contraseña o rol no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
