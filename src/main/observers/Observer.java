package main.observers;

import main.productos.Producto;

public interface Observer {
    public void notificarVentaDe(Producto producto);
}
