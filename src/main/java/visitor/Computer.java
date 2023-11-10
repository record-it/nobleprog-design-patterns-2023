package visitor;

public class Computer implements Visitable{
    private Board board;
    private Mouse mouse;

    public Computer(Board board, Mouse mouse) {
        this.board = board;
        this.mouse = mouse;
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("accept");
        visitor.visit(this);
        board.accept(visitor);
        mouse.accept(visitor);
    }

    @Override
    public boolean isFunctional() {
        return true;
    }

    @Override
    public String toString() {
        return "Computer";
    }

}
