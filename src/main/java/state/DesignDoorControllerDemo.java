package state;

import state.design.DoorController;

import java.util.Scanner;

public class DesignDoorControllerDemo {
    static DoorController controller = new DoorController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Runnable[] actions = {
                () -> controller.open(),
                () -> controller.close(),
                () -> controller.lock(),
                () -> controller.unlock(),
                () -> System.exit(0)
        };
        while(true){
            controller.printStatus();
            System.out.println("1. open");
            System.out.println("2. close");
            System.out.println("3. lock");
            System.out.println("4. unlock");
            System.out.println("5. quit");
            int option = scanner.nextInt();
            if (option > 0 && option <= actions.length){
                actions[option - 1].run();
                controller.printStatus();
            }
        }


    }
}
