package Controlador;

import Modelo.Product;
import Vista.ViewProduct;
import java.util.List;

public class ProductController {
    private ViewProduct view;

public ProductController (ViewProduct view ){
    this.view = view;
}

    public void insertNewProduct(Product newProduct){
        Product.insertProduct(newProduct);
        view.mostrarMensaje("\nJoya guardada correctamente!");
    }
    public void displayAllProducts() {
        List<Product> products = Product.getAllProducts();
        view.displayListProducts(products);
    }
}
