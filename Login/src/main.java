
import Controlador.LoginControlador;
import Db.connection;
import Vista.VistaLogin;


public class main {
    
    public static void main(String[] args) {
        connection.getConnection();
        LoginControlador loginControlador = new LoginControlador();
        loginControlador.iniciarLogin();
    }
      
}
