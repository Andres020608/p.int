package Vista;
import Interfaces.Mensaje;
import Modelo.User;
import java.util.List;

public class ViewUser implements  Mensaje{
    public void displayListUsers(List<User> Users) {
        System.out.println(" == Lista de usuarios == ");
        for (User user : Users) {
            System.out.println("id usuario: " + user.getId_usuario() + ",nombre usuario: " + user.getNombre_usuario() + ",fecha creacion: " + user.getFecha_creacion() + ", password: " + user.getPassword() + ", id tipo usuario: " +user.getTipo_usuario_id_tipo_usua() + ", id persona: " +user.getPersona_id_persona());
        }
    }
}
