package main.impuestos;

public class EO implements ImpuestoAplicable {
    private Double factorGananciasImpositivas;
    private Double factorPrecioBase;
    private Double gananciasImpositivas;

    public EO(Double factorGananciasImpositivas, Double factorPrecioBase, Double gananciasImpositivas) {
        this.factorGananciasImpositivas = factorGananciasImpositivas;
        this.factorPrecioBase = factorPrecioBase;
        this.gananciasImpositivas = gananciasImpositivas;
    }

    @Override
    public Double calculate(Double precio) {
        return Double.valueOf(1);
    }
}
