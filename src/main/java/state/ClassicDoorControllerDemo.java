package state;

import state.classic.ClassicDoorController;

import java.util.Scanner;

public class ClassicDoorControllerDemo {
    static ClassicDoorController controller = new ClassicDoorController();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.next();
            controller.request(input);
        }
    }
}
