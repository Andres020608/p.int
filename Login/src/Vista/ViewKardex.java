package Vista;
import Interfaces.Mensaje;
import Modelo.Kardex;
import java.util.List;

public class ViewKardex  {
    public void displayListKardexes(List<Kardex> Kardexes) {
        System.out.println(" == Lista de Kardex == ");
        for (Kardex kardex : Kardexes) {
            System.out.println("id_kardex: " +kardex.getId_kardex() + " , fecha_registro: " + kardex.getFecha_registro() + ", fecha_movimiento: " + kardex.getFecha_movimiento() + ", cantidad: " +kardex.getCantidad() + ", fech_ultim_actu: " + kardex.getFech_ultim_actu() + ", usuario_id_usuario: " + kardex.getUsuario_id_usuario() + ", tipo_movimiento_id_tip_mov: " + kardex.getTipo_movimiento_id_tip_mov() + ", joya_id_joya: " + kardex.getJoya_id_joya());
        }
    }
}
