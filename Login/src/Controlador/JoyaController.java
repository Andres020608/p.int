package Controlador;

import Modelo.Joya;
import Modelo.User;
import Vista.ViewProduct;
import java.util.ArrayList;

public class JoyaController {
    private ViewProduct view;
        int id_tipo_joya ;
        String nombreJoya ;
    Joya joya = new Joya();

    public int getId_tipo_joya() {
        return id_tipo_joya;
    }

    public String getNombreJoya() {
        return nombreJoya;
    }

   



public JoyaController (){
    
}
    public  ArrayList<Joya> traerTipoJoyas(){
        ArrayList<Joya> joyas = joya.getAlltiposJoyas();
         
        for (Joya joya : joyas) {
        int id_tipo_joya = joya.getId_tipo_joya();
        String nombreJoya = joya.getNombre_tipo_joya();
                    
    }
        return joyas;
    }
    
    public  ArrayList<Joya> traermateriales(){
        ArrayList<Joya> joyas = joya.getAlltiposJoyas();
         
        for (Joya joya : joyas) {
        int id_material = joya.getId_material();
        String nombreMaterial = joya.getNombre_material();
                    
    }
        return joyas;
    }
    
    public void llevarDatosJoya(String nombre, int peso,double cantidadJoyas, double precio,double costo_Joya,int id_tipo_joya,  int material){
        joya.setNombre(nombre);
        joya.setPeso(peso);
        joya.setCantidad_saldo(cantidadJoyas);
        joya.setPrecio_venta(precio);
        joya.setCosto_joya(costo_Joya);
        joya.setTipo_joya_id_tipo_joya(id_tipo_joya);
        joya.setId_material(material);
        LoginControlador loginControlador = new LoginControlador();
        int id_usuario = loginControlador.actualizarIdUsuario();
        joya.setUsuario_id_usuario(id_usuario);
        joya.insertJoya(joya);
        
        
    }
    public void traerJoyas(ArrayList<Joya> joyas){
        joya.getAllJoyas();
        
    }
    public void llevarDatosJoyaPorId(int id_joya){
        joya.setId_joya(id_joya);
        System.out.println(id_joya);
        
        
    }
    
    }
    

