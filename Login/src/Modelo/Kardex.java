package Modelo;

import Db.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
public class Kardex {

    protected int id_kardex;
    protected Date fecha_registro;
    protected Date fecha_movimiento;
    protected int cantidad;
    protected Date fech_ultim_actu;
    protected int usuario_id_usuario;
    protected int tipo_movimiento_id_tip_mov;
    protected int joya_id_joya;

    public Kardex(int id_kardex, Date fecha_registro, Date fecha_movimiento, int cantidad, Date fech_ultim_actu, int usuario_id_usuario, int tipo_movimiento_id_tip_mov, int joya_id_joya) {
        this.id_kardex = id_kardex;
        this.fecha_registro = fecha_registro;
        this.fecha_movimiento = fecha_movimiento;
        this.cantidad = cantidad;
        this.fech_ultim_actu = fech_ultim_actu;
        this.usuario_id_usuario = usuario_id_usuario;
        this.tipo_movimiento_id_tip_mov = tipo_movimiento_id_tip_mov;
        this.joya_id_joya = joya_id_joya;
    }

    public int getId_kardex() {
        return id_kardex;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public Date getFecha_movimiento() {
        return fecha_movimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFech_ultim_actu() {
        return fech_ultim_actu;
    }

    public int getUsuario_id_usuario() {
        return usuario_id_usuario;
    }

    public int getTipo_movimiento_id_tip_mov() {
        return tipo_movimiento_id_tip_mov;
    }

    public int getJoya_id_joya() {
        return joya_id_joya;
    }
    public static void insertKardex(Kardex kardex) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO kardex (id_kardex, fecha_registro, fecha_movimiento, cantidad, fech_ultim_actu, usuario_id_usuario, tipo_movimiento_id_tip_mov, joya_id_joya) values (?,?,?,?,?,?,?,?)";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, kardex.getId_kardex());
            statement.setDate(2, kardex.getFecha_registro());
            statement.setDate(3, kardex.getFecha_movimiento());
            statement.setInt(4, kardex.getCantidad());
            statement.setDate(5, kardex.getFech_ultim_actu());
            statement.setInt(6, kardex.getUsuario_id_usuario());
            statement.setInt(7, kardex.getTipo_movimiento_id_tip_mov());
            statement.setInt(8, kardex.getJoya_id_joya());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static List<Kardex> getAllkardexes() {
        Connection con = connection.getConnection();
        List<Kardex> kardexes = new ArrayList<>();

        String sql = "SELECT * FROM kardex";
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                Kardex kardex = new Kardex(
                        rs.getInt("id_kardex"),
                        rs.getDate("fecha_registro"),
                        rs.getDate("fecha_movimiento"),
                        rs.getInt("cantidad"),
                        rs.getDate("fech_ultim_actu"),
                        rs.getInt("usuario_id_usuario"),
                        rs.getInt("tipo_movimiento_id_tip_mov"),
                        rs.getInt("joya_id_joya")

                );
                kardexes.add(kardex);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kardexes;
    }
}
