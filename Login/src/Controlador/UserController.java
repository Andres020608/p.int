package Controlador;
import Modelo.User;
import java.util.List;

public class UserController {


    public UserController (){

    }
       

    public void insertNewUser(User newUser){
        User.insertUser(newUser);
        //view.mostrarMensaje("\nusuario guardado correctamente!");
    }
    public void displayAllUsers() {
        List<User> users = User.getAllusers();
        //view.displayListUsers(users);
    }

}
