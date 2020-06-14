package main.observers;

import main.productos.Producto;

public class ContadorDeVentas implements Observer {
    private Integer cantidadDeVentas;

    public ContadorDeVentas(Integer cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }

    @Override
    public void notificarVentaDe(Producto producto) {

    }
}
