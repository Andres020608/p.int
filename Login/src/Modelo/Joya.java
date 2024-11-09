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
    protected float peso;
    protected double cantidad_saldo;
    protected double precio_venta;
    protected double costo_joya;
    protected int usuario_id_usuario;
    protected int tipo_joya_id_tipo_joya;
    protected String nombre_color;  // Nuevo atributo
    protected String nombre_material;  // Nuevo atributo
    protected String nombre_tipo_joya;
    protected int id_tipo_joya;

    public Joya() {
        
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

    public float getPeso() {
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

    public static void insertProduct(Joya product) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO joya (id_joya, nombre, codigo_catalogo, peso, tamano_m1, tamano_m2, cantidad_saldo, precio_venta, costo_joya, fech_ultim_act, usuario_id_usuario, tipo_joya_id_tipo_joya) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, product.getId_joya());
            statement.setString(2, product.getNombre());
            statement.setInt(3, product.getCodigo_catalogo());
            statement.setFloat(4, product.getPeso());
            statement.setDouble(7, product.getCantidad_saldo());
            statement.setDouble(8, product.getPrecio_venta());
            statement.setDouble(9, product.getCosto_joya());
            statement.setInt(11, product.getUsuario_id_usuario());
            statement.setInt(12, product.getTipo_joya_id_tipo_joya());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*public static List<Joya> getAllProducts() {
        Connection con = connection.getConnection();
        List<Joya> products = new ArrayList<>();
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
                Joya joya = new Joya(
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
    }*/
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


}
