package strategy;

import lombok.Getter;

public class Client {
    @Getter
    private final TaxStrategy tax;
    @Getter
    private final String name;

    public Client(TaxStrategy tax, String name) {
        this.tax = tax;
        this.name = name;
    }
}
