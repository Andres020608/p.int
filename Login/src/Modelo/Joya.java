package Modelo;

import Db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

public class Joya {

    protected int id_joya;
    protected String nombre;
    protected int codigo_catalogo;
    protected int peso;
    protected double cantidad_saldo;
    protected double precio_venta;
    protected double costo_joya;
    protected int usuario_id_usuario;
    protected int tipo_joya_id_tipo_joya;
    protected String nombre_color;  // Nuevo atributo
    protected String nombre_material;  // Nuevo atributo
    protected int id_material;
    protected String nombre_tipo_joya;
    protected int id_tipo_joya;

    public Joya() {

    }

    public void setUsuario_id_usuario(int usuario_id_usuario) {
        this.usuario_id_usuario = usuario_id_usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setCantidad_saldo(double cantidad_saldo) {
        this.cantidad_saldo = cantidad_saldo;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public void setCosto_joya(double costo_joya) {
        this.costo_joya = costo_joya;
    }

    public void setTipo_joya_id_tipo_joya(int tipo_joya_id_tipo_joya) {
        this.tipo_joya_id_tipo_joya = tipo_joya_id_tipo_joya;
    }

    public void setNombre_material(String nombre_material) {
        this.nombre_material = nombre_material;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public String getNombre_tipo_joya() {
        return nombre_tipo_joya;
    }

    public void setNombre_tipo_joya(String nombre_tipo_joya) {
        this.nombre_tipo_joya = nombre_tipo_joya;
    }

    public int getId_tipo_joya() {
        return id_tipo_joya;
    }

    public void setId_joya(int id_joya) {
        this.id_joya = id_joya;
    }

    public int getId_joya() {
        return id_joya;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo_joya(String tipo_joya) {
        this.nombre_tipo_joya = tipo_joya;
    }

    public void setId_tipo_joya(int id_tipo_joya) {
        this.id_tipo_joya = id_tipo_joya;
    }

    public int getCodigo_catalogo() {
        return codigo_catalogo;
    }

    public int getPeso() {
        return peso;
    }

    public double getCantidad_saldo() {
        return cantidad_saldo;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public double getCosto_joya() {
        return costo_joya;
    }

    public int getUsuario_id_usuario() {
        return usuario_id_usuario;
    }

    public int getTipo_joya_id_tipo_joya() {
        return tipo_joya_id_tipo_joya;
    }

    public String getNombre_color() {
        return nombre_color;
    }

    public String getNombre_material() {
        return nombre_material;
    }

    public String getTipo_joya() {
        return nombre_tipo_joya;
    }

    public static void insertJoya(Joya joya) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO joya ( nombre,  peso, cantidad_saldo, precio_venta, costo_joya, usuario_id_usuario, tipo_joya_id_tipo_joya) VALUES (?,?,?,?,?,?,?)";
        try (PreparedStatement statement = con.prepareStatement(sql)) {

            statement.setString(1, joya.getNombre());
            statement.setInt(2, joya.getPeso());
            statement.setDouble(3, joya.getCantidad_saldo());
            statement.setDouble(4, joya.getPrecio_venta());
            statement.setDouble(5, joya.getCosto_joya());
            statement.setInt(6, joya.getUsuario_id_usuario());
            statement.setInt(7, joya.getTipo_joya_id_tipo_joya());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Joya> getAllJoyas() {
        Connection con = connection.getConnection();
        List<Joya> joyas = new ArrayList<>();
        String sql = "SELECT j.nombre, "
                + "       j.peso, "
                + "       j.cantidad_saldo, "
                + "       j.precio_venta, "
                + "       j.costo_joya, "
                + "       j.usuario_id_usuario, "
                + "       j.tipo_joya_id_tipo_joya, "
                + "       tj.nombre_tipo_joya AS tipo_joya, "
                + "       m.nombre_material "
                + "FROM joya j "
                + "JOIN tipo_joya tj ON j.tipo_joya_id_tipo_joya = tj.id_tipo_joya "
                + "JOIN joya_material jm ON j.id_joya = jm.joya_id_joya "
                + "JOIN material m ON jm.material_id_material = m.id_material "
                + "JOIN color c ON m.color_id_color = c.id_color";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Joya joya = new Joya();
                joya.setNombre(rs.getString("nombre"));
                joya.setPeso(rs.getInt("peso"));
                joya.setCantidad_saldo(rs.getDouble("cantidad_saldo"));
                joya.setPrecio_venta(rs.getDouble("precio_venta"));
                joya.setCosto_joya(rs.getDouble("costo_joya"));
                joya.setTipo_joya_id_tipo_joya(rs.getInt("tipo_joya_id_tipo_joya"));

                joyas.add(joya);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return joyas;
    }

    public ArrayList<Joya> getAlltiposJoyas() {
        Connection con = connection.getConnection();
        ArrayList<Joya> joyas = new ArrayList<>();

        String sql = "SELECT * FROM tipo_joya";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Joya joya = new Joya();
                joya.setId_tipo_joya(rs.getInt("id_tipo_joya"));
                joya.setTipo_joya(rs.getString("nombre_tipo_joya"));
                //System.out.println(id_tipo_joya);
                joyas.add(joya);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return joyas;

    }

    


    public ArrayList<Joya> getAllmateriales() {
        Connection con = connection.getConnection();
        ArrayList<Joya> joyas = new ArrayList<>();

        String sql = "SELECT * FROM material";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Joya joya = new Joya();
                joya.setId_material(rs.getInt("id_material"));
                joya.setNombre_material(rs.getString("nombre_material"));
                joyas.add(joya);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return joyas;

    }

}
