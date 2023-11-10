package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// napisz polecenie SaveToFile, które zapisuje do wskazanego pliku tekstowego
// łańcuch zwracany przez Supplier<String>
// Files.writeString()
// wstaw nowe polecenie na końcu, aby zapisać rezultat obliczeń
public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Command> macro = new ArrayList<>();
        macro.add(new PrintCommand(() -> "Wpisz liczbę"));
        InputDoubleCommand c1 = new InputDoubleCommand(scanner);
        macro.add(c1);
        macro.add(new PrintCommand(() -> "Wpisz liczbę"));
        InputDoubleCommand c2 = new InputDoubleCommand(scanner);
        macro.add(c2);
        var add = new AddTwoDoubleCommand(c1::getValue, c2::getValue);
        macro.add(add);
        macro.add(new PrintCommand(() -> "Wynik: " + add.getResult()));
        System.out.println("Wykonanie macro");
        c1 = null;
        c2 = null;
        for(var command: macro){
            command.execute();
        }
    }
}
