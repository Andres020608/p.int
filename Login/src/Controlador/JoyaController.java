package Controlador;

import Modelo.Joya;
import Vista.ViewProduct;
import java.util.ArrayList;

public class JoyaController {
    private ViewProduct view;
        int id_tipo_joya ;
        String nombreJoya ;

    public int getId_tipo_joya() {
        return id_tipo_joya;
    }

    public String getNombreJoya() {
        return nombreJoya;
    }

   
    Joya joya = new Joya();


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
    public void insertNewProduct(Joya newProduct){
        Joya.insertProduct(newProduct);
        //view.mostrarMensaje("\nJoya guardada correctamente!");
    }
    public void displayAllProducts() {
       // ArrayList<Joya> products = Joya.getAllProducts();
       // view.displayListProducts(products);
    }
}
