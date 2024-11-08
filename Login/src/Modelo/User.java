package Modelo;

import Db.connection;
import Interfaces.Mensaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import javax.swing.JOptionPane;




public class User implements Mensaje{
    //User user = new User();
    protected int id_usuario;
    protected String nombre_usuario;
    protected Date fecha_creacion;
    protected String password;
    protected int tipo_usuario_id_tipo_usua;
    protected int persona_id_persona;
    protected int id_persona;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String telefono;

    public User() {
        
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTipo_usuario_id_tipo_usua() {
        return tipo_usuario_id_tipo_usua;
    }

    public void setTipo_usuario_id_tipo_usua(int tipo_usuario_id_tipo_usua) {
        this.tipo_usuario_id_tipo_usua = tipo_usuario_id_tipo_usua;
    }

    public int getPersona_id_persona() {
        return persona_id_persona;
    }

    public void setPersona_id_persona(int persona_id_persona) {
        this.persona_id_persona = persona_id_persona;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

 
    
    
    
    public static void insertUser(User user) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO usuario (nombre_usuario,fecha_creacion,password,tipo_usuario_id_tipo_usua,persona_id_persona) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, user.getNombre_usuario());
            statement.setDate(2, new java.sql.Date(user.getFecha_creacion().getTime())); // Convertir Date a java.sql.Date
            statement.setString(3, user.getPassword());
            statement.setInt(4, user.getTipo_usuario_id_tipo_usua());
            statement.setInt(5, user.getPersona_id_persona());

            statement.executeUpdate();
            user.mostrarMensaje("Usuario ingresado correctamente");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   public static List<User> getAllusers() {
        Connection con = connection.getConnection();
        List<User> users = new ArrayList<>();

        String sql = "SELECT * FROM usuario";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId_usuario(rs.getInt("id_usuario"));
                user.setNombre_usuario(rs.getString("nombre_usuario"));
                user.setFecha_creacion(rs.getDate("fecha_creacion"));
                user.setPassword(rs.getString("password"));
                user.setTipo_usuario_id_tipo_usua(rs.getInt("tipo_usuario_id_tipo_usua"));
                user.setPersona_id_persona(rs.getInt("persona_id_persona"));

                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;


   }
   
             @Override
            public void mostrarMensaje(String mensaje){
               JOptionPane.showMessageDialog(null, mensaje, "Atencion", JOptionPane.INFORMATION_MESSAGE);
}
   
    public static void insertPerson(User user) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO persona ( nombre, apellido, correo, telefono) VALUES ( ?, ?, ?, ?)";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, user.getNombre());
            statement.setString(2, user.getApellido());
            statement.setString(3, user.getCorreo());
            statement.setString(4, user.getTelefono());

            statement.executeUpdate();
  
            user.mostrarMensaje("Usuario ingresado correctamente");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener todas las personas
    public static ArrayList<User> getAllpersons() {
        Connection con = connection.getConnection();
        ArrayList<User> persons = new ArrayList<>();

        String sql = "SELECT * FROM persona";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId_persona(rs.getInt("id_persona"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setCorreo(rs.getString("correo"));
                user.setTelefono(rs.getString("telefono"));

                persons.add(user);
             
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persons;
    }
    public void traerPersona (ArrayList<User> persons){
        getAllpersons();
        for(int i=0;i<persons.size();i++){
            User obj =  persons.get(i);
            int id_persona = obj.getId_persona();
            String nombrePersona = obj.getNombre();
            
    }

}
}
