package Vista;
import Interfaces.Mensaje;
import Modelo.Product;
import java.util.List;

public class ViewProduct implements Mensaje {
    public void displayListProducts(List<Product> Products) {
        System.out.println(" == Lista de Joyas == ");
        for (Product product : Products) {
            System.out.println("id Joya: " + product.getId_joya() + ", Nombre: " +product.getNombre() + ", Codigo del catalogo: " +product.getCodigo_catalogo() + ", Peso: " + product.getPeso() + ", Tamaño m1: " + product.getTamano_m1() + ", Tamaño m2: " + product.getTamano_m2() + ", Cantidad saldo: " + product.getCantidad_saldo() + ", Precio venta: " + product.getPrecio_venta() + ", Costo joya: " + product.getCosto_joya() + ", Fecha de ultima actualización: " + product.getFech_ultim_act() + ", id Usuario: " + product.getUsuario_id_usuario() + ", id Tipo Joya: " + product.getTipo_joya_id_tipo_joya() + "nombre color: " + product.getNombre_color() + "nombre material: " + product.getNombre_material() + "Tipo joya: " + product.getTipo_joya());
        }
    }
}
