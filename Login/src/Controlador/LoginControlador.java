
package Controlador;


import Modelo.Login;
import Vista.VistaLogin;


public class LoginControlador {

public void iniciarLogin(){
        VistaLogin vistaLogin = new VistaLogin();
        vistaLogin.setVisible(true);
        vistaLogin.setLocationRelativeTo(null);
        
    }
    public void verificaUsuario(String Nombre, String Contraseña, int Rol){
        Login login = new Login();
        login.setUsuario(Nombre);
        login.setContraseña(Contraseña);
        login.setRol(Rol);
        login.verificacionUsuario(login);
    }

}
