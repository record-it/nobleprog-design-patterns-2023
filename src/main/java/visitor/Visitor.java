package visitor;

public interface Visitor {
    void visit(Board board);
    void visit(Computer computer);
    void visit(CPU cpu);
    void visit(RAM ram);
    void visit(Mouse mouse);
}
