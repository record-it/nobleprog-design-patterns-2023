package command;

import lombok.Getter;

import java.util.function.Supplier;

public class AddTwoDoubleCommand implements Command{
    private final Supplier<Double> a;
    private final Supplier<Double> b;
    @Getter
    private double result;
    public AddTwoDoubleCommand(Supplier<Double> a, Supplier<Double> b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute() {
        result = a.get() + b.get();
    }
}
