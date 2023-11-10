package strategy;

public class VatTax implements TaxStrategy{
    private final double cost;
    private final double vat;

    public VatTax(double cost, double vat) {
        this.cost = cost;
        this.vat = vat;
    }

    @Override
    public double calculate() {
        return cost * vat;
    }
}
