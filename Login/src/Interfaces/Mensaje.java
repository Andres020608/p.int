package Interfaces;

public interface Mensaje {
    default void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
