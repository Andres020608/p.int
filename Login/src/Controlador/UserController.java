package Controlador;

import Modelo.User;
import java.sql.Date;
import java.util.List;

public class UserController {

    public UserController() {

    }

    public void traerDatosUsuario(String nombre_usuario, Date fecha_creacion,String password,
           String nombre, String apellido,
            String correo, String telefono) {
        User usuario = new User();
        //usuario.setId_usuario(id_usuario);
        usuario.setNombre_usuario(nombre_usuario);
        usuario.setFecha_creacion(fecha_creacion);
        usuario.setPassword(password);
        //usuario.setTipo_usuario_id_tipo_usua(tipo_usuario_id_tipo_usua);
        //usuario.setPersona_id_persona(persona_id_persona);
        //usuario.setId_persona(id_persona);
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setCorreo(correo);
        usuario.setTelefono(telefono);
        usuario.insertPerson(usuario);
        usuario.insertUser(usuario);
        usuario.getAllpersons();
        usuario.getAllusers();
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
