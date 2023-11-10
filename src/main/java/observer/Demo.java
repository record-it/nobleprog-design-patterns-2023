package observer;

public class Demo {
    public static void main(String[] args) {
        Game game = new Game();
        game.addObserver(event -> System.out.println("Observer 1, " + event));
        game.move(1,2, 'X');
    }
}
