package main.observers;

import main.productos.Producto;

public class OficinaContable implements Observer {
    private Double totalLibroDiario;

    public OficinaContable(Double totalLibroDiario) {
        this.totalLibroDiario = totalLibroDiario;
    }

    @Override
    public void notificarVentaDe(Producto producto) {

    }
}
