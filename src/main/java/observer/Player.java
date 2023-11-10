package observer;

public class Player implements Observer{
    private final char sign;
    private final Game game;
    public Player(char sign, Game game) {
        this.sign = sign;
        this.game = game;
    }

    @Override
    public void update(String event) {
        String[] split = event.split("\\s");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (split[split.length -1].charAt(0) != sign){
            System.out.println("Opponent move: " + event);
            game.move(0, 0,sign);
        }

    }
}
