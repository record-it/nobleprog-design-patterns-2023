package observer;

import java.util.ArrayList;
import java.util.List;

public class Game implements Observable{
    private List<Observer> observers = new ArrayList<>();
    private char[][] board = new char[3][3];


    public void move(int c, int r, char player){
        board[c][r] = player;
        notifyAllObservers(String.format("move at [%d][%d] by %s", c, r, player));
    }

    private void notifyAllObservers(String event){
        for (var o: observers) {
            o.update(event);
        }
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
