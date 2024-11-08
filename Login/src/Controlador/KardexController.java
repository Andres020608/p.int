package Controlador;

import Modelo.Kardex;
import Vista.ViewKardex;
import java.util.List;

public class KardexController {
    private ViewKardex view;

    public KardexController (ViewKardex view ){
        this.view = view;
    }

    public void insertNewKardex(Kardex newKardex){
        Kardex.insertKardex(newKardex);
        //view.mostrarMensaje("\nKardex guardado correctamente!");
    }
    public void displayAllKardexes() {
        List<Kardex> kardexes = Kardex.getAllkardexes();
        view.displayListKardexes(kardexes);
    }
}
