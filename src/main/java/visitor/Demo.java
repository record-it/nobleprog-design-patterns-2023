package visitor;

public class Demo {
    public static void main(String[] args) {
        Board board = new Board(new RAM(), new CPU());
        Computer computer = new Computer(board, new Mouse());
        IsFunctionalVisitor visitor = new IsFunctionalVisitor();
        computer.accept(visitor);
        System.out.println(visitor.getMessage());
        System.out.println(visitor.isFunctional());
    }
}
