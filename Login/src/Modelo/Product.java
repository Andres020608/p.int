package Modelo;

import Db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

public class Product {
    protected int id_joya;
    protected String nombre;
    protected int codigo_catalogo;
    protected float peso;
    protected float tamano_m1;
    protected float tamano_m2;
    protected double cantidad_saldo;
    protected double precio_venta;
    protected double costo_joya;
    protected Date fech_ultim_act;
    protected int usuario_id_usuario;
    protected int tipo_joya_id_tipo_joya;
    protected String nombre_color;  // Nuevo atributo
    protected String nombre_material;  // Nuevo atributo
    protected String tipo_joya;

    public Product(int id_joya, String nombre, int codigo_catalogo, float peso, float tamano_m1, float tamano_m2, double cantidad_saldo, double precio_venta, double costo_joya, Date fech_ultim_act, int usuario_id_usuario, int tipo_joya_id_tipo_joya, String nombre_color, String nombre_material, String tipo_joya) {
        this.id_joya = id_joya;
        this.nombre = nombre;
        this.codigo_catalogo = codigo_catalogo;
        this.peso = peso;
        this.tamano_m1 = tamano_m1;
        this.tamano_m2 = tamano_m2;
        this.cantidad_saldo = cantidad_saldo;
        this.precio_venta = precio_venta;
        this.costo_joya = costo_joya;
        this.fech_ultim_act = fech_ultim_act;
        this.usuario_id_usuario = usuario_id_usuario;
        this.tipo_joya_id_tipo_joya = tipo_joya_id_tipo_joya;
        this.nombre_color = nombre_color;
        this.nombre_material = nombre_material;
        this.tipo_joya = tipo_joya;
    }

    public int getId_joya() {
        return id_joya;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo_catalogo() {
        return codigo_catalogo;
    }

    public float getPeso() {
        return peso;
    }

    public float getTamano_m1() {
        return tamano_m1;
    }

    public float getTamano_m2() {
        return tamano_m2;
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

    public Date getFech_ultim_act() {
        return fech_ultim_act;
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
        return tipo_joya;
    }

    public static void insertProduct(Product product) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO joya (id_joya, nombre, codigo_catalogo, peso, tamano_m1, tamano_m2, cantidad_saldo, precio_venta, costo_joya, fech_ultim_act, usuario_id_usuario, tipo_joya_id_tipo_joya) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, product.getId_joya());
            statement.setString(2, product.getNombre());
            statement.setInt(3, product.getCodigo_catalogo());
            statement.setFloat(4, product.getPeso());
            statement.setFloat(5, product.getTamano_m1());
            statement.setFloat(6, product.getTamano_m2());
            statement.setDouble(7, product.getCantidad_saldo());
            statement.setDouble(8, product.getPrecio_venta());
            statement.setDouble(9, product.getCosto_joya());
            statement.setDate(10, product.getFech_ultim_act());
            statement.setInt(11, product.getUsuario_id_usuario());
            statement.setInt(12, product.getTipo_joya_id_tipo_joya());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> getAllProducts() {
        Connection con = connection.getConnection();
        List<Product> products = new ArrayList<>();
        String sql = "SELECT j.id_joya, " +
                "       j.nombre, " +
                "       j.codigo_catalogo, " +
                "       j.peso, " +
                "       j.tamano_m1, " +
                "       j.tamano_m2, " +
                "       j.cantidad_saldo, " +
                "       j.precio_venta, " +
                "       j.costo_joya, " +
                "       j.fech_ultim_act, " +
                "       j.usuario_id_usuario, " +
                "       j.tipo_joya_id_tipo_joya, " +
                "       c.nombre_color, " +
                "       tj.nombre_tipo_joya AS tipo_joya, " +
                "       m.nombre_material " +
                "FROM joya j " +
                "JOIN tipo_joya tj ON j.tipo_joya_id_tipo_joya = tj.id_tipo_joya " +
                "JOIN joya_material jm ON j.id_joya = jm.joya_id_joya " +
                "JOIN material m ON jm.material_id_material = m.id_material " +
                "JOIN color c ON m.color_id_color = c.id_color";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Product product = new Product(
                        rs.getInt("id_joya"),
                        rs.getString("nombre"),
                        rs.getInt("codigo_catalogo"),
                        rs.getFloat("peso"),
                        rs.getFloat("tamano_m1"),
                        rs.getFloat("tamano_m2"),
                        rs.getDouble("cantidad_saldo"),
                        rs.getDouble("precio_venta"),
                        rs.getDouble("costo_joya"),
                        rs.getDate("fech_ultim_act"),
                        rs.getInt("usuario_id_usuario"),
                        rs.getInt("tipo_joya_id_tipo_joya"),
                        rs.getString("nombre_color"),
                        rs.getString("nombre_material"),
                        rs.getString("tipo_joya")

                );
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }



}
