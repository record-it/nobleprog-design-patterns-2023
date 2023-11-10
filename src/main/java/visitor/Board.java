package visitor;

public class Board implements Visitable{
    private RAM ram;
    private CPU cpu;

    public Board(RAM ram, CPU cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("accept");
        visitor.visit(this);
        ram.accept(visitor);
        cpu.accept(visitor);
    }

    @Override
    public boolean isFunctional() {
        return false;
    }

    @Override
    public String toString() {
        return "Board AM34";
    }
}
