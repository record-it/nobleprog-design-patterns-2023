package command;

import java.util.function.Supplier;

public class PrintCommand implements Command{
    private final Supplier<String> message;

    public PrintCommand(Supplier<String> message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message.get());
    }
}
