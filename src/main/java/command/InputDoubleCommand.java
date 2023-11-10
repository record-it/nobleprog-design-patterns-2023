package command;

import lombok.Getter;

import java.util.Scanner;

public class InputDoubleCommand implements Command{
    private final Scanner scanner;
    @Getter
    private double value;
    public InputDoubleCommand(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        value = scanner.nextDouble();
    }
}
