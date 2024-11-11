
package Controlador;


import Modelo.Login;
import Vista.VistaLogin;
import Vista.viewCrearUsuario;
import Modelo.User;


public class LoginControlador {
    User user = new User();
    Login login = new Login();
    int id_usuario;
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
     public int actualizarIdUsuario() {
         User.getAllusers();
        id_usuario = login.traerIdUsuario(); 
         System.out.println(id_usuario);
    return id_usuario;
     }

public void iniciarLogin(){
        VistaLogin vistaLogin = new VistaLogin();
        vistaLogin.setVisible(true);
        vistaLogin.setLocationRelativeTo(null);
        
    }

public void iniciarCrearUsuario(){
        viewCrearUsuario viewCrearUsuario1 = new viewCrearUsuario();
        viewCrearUsuario1.setVisible(true);
        viewCrearUsuario1.setLocationRelativeTo(null);
        
    }
    public void verificaUsuario(String Nombre, String Contraseña, int Rol){
        login.setUsuario(Nombre);
        login.setContraseña(Contraseña);
        login.setRol(Rol);
        login.verificacionUsuario(login);
        
    }   
    
}
