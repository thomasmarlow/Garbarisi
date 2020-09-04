// Importando cosas que suenan a importantes
package main.productos;
import main.observers.Observer;

import java.util.List;

public class Producto {
    private String descripcion;
    private Double precio;
    private TipoDeProducto tipo;
    private List<Observer> observers;

    public Producto(String descripcion, Double precio, TipoDeProducto tipo) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo = tipo;
    }

    public void vendete() {
        observers.stream().forEach((observer) -> observer.notificarVentaDe(this));
    }
}
