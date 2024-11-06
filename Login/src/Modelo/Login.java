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


public class Login {
    protected int Rol;
    protected String Usuario;
    protected String Contraseña;
    private paginaInicio inicio;
    private VistaLogin vistaLogin;

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
    
      void verificaraUsuario(Login login) {
        
        Connection con = connection.getConnection();
        String Usuario = login.getUsuario();
        String Contraseña = login.getContraseña();
        int Rol = login.getRol();
        

        String sql = "SELECT * FROM usuario WHERE nombre_usuario = '" + Usuario + "' AND password = '" + Contraseña + "' AND tipo_usuario_id_tipo_usua = " + Rol;

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, Usuario);
            statement.setString(2, Contraseña);
            statement.setInt(3, Rol);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Usuario validado correctamente");
                inicio.setVistaLogin(vistaLogin);
                inicio.setVisible(true);
                inicio.setSize(800, 500);
                inicio.setLocation(0, 0);
                vistaLogin.setVisible(false);
                
            }else{
                JOptionPane.showMessageDialog(null,"El usuario, contraseña o rol no coinciden"+JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
