package observer;
// Zdefiniuj obserwatora, który liczy i wyświetla ruchy
public class Demo {
    public static void main(String[] args) {
        Game game = new Game();

        game.addObserver(event -> System.out.println("Observer 1, " + event));
        Player playerX = new Player('X', game);
        game.addObserver(playerX);
        game.move(1,2, 'O');
        game.removeObserver(playerX);
        game.move(2,2, 'Y');
    }
}
