
package Controlador;


import Modelo.Login;
import Vista.VistaLogin;


public class LoginControlador {
    Login login = new Login();
public void iniciarLogin(){
        VistaLogin login = new VistaLogin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
    }
    public void verificacionUsuario(String Nombre, String Contraseña, int Rol){
        login.setUsuario(Nombre);
        login.setContraseña(Contraseña);
        login.setRol(Rol);
    }

}
