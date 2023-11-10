package strategy;

import lombok.Data;

@Data
public class ScaleTax implements TaxStrategy{
    private static final double FREE = 30_000;
    private double income;
    private double cost;
    private int children;

    public ScaleTax(double income, double cost, int children) {
        this.income = income;
        this.cost = cost;
        this.children = children;
    }

    @Override
    public double calculate() {
       if ((income - cost - FREE) > 120_000){
           return (income - cost - FREE - 120_000) * 0.32 + 120_000 * 0.12 - children * 1000;
       } else {
           return (income - cost - FREE) * 0.12 - children * 1000;
       }
    }
}
