package main.productos;
import main.impuestos.ImpuestoAplicable;

import java.util.List;

public class TipoDeProducto {
    private String descripcion;
    private List<ImpuestoAplicable> impuestos;

    public TipoDeProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarImpuestos(ImpuestoAplicable impuesto) {
        this.impuestos.add(impuesto);
    }

    public Double totalDeImpuestosPara(Producto producto) {
        return null;
    }
}
