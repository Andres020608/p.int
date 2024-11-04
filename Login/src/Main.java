
import Controlador.LoginControlador;
import Db.connection;


public class Main {
    public static void main(String[] args) {
        connection.getConnection();
        LoginControlador loginControlador = new LoginControlador();
        loginControlador.iniciarLogin();
    }
    
}
