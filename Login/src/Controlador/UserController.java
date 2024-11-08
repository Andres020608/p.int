package Controlador;

import Modelo.User;
import java.sql.Date;
import java.util.List;

public class UserController {

    public UserController() {

    }

    public void traerDatosUsuario(String nombre_usuario, Date fecha_creacion, String password,int rol, int id_persona) {
        User usuario = new User();
       
        usuario.setNombre_usuario(nombre_usuario);
        usuario.setFecha_creacion(fecha_creacion);
        usuario.setPassword(password);
        usuario.setTipo_usuario_id_tipo_usua(rol);
        usuario.setId_persona(id_persona);
        
        
        usuario.insertUser(usuario);
       
        usuario.getAllusers();
    }

    public void traerDatosPersona(String nombre, String apellido,String correo, String telefono){
        User usuario = new User();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setCorreo(correo);
        usuario.setTelefono(telefono);
        
        usuario.insertPerson(usuario);
        usuario.getAllpersons();
    }

    

    public void insertNewUser(User newUser) {
        User.insertUser(newUser);
        //view.mostrarMensaje("\nusuario guardado correctamente!");
    }

    public void displayAllUsers() {
        List<User> users = User.getAllusers();
        //view.displayListUsers(users);
    }

}
