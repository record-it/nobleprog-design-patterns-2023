package visitor;

import lombok.Getter;

public class IsFunctionalVisitor implements Visitor{
    @Getter
    private boolean isFunctional = true;
    @Getter
    private String message = "";
    @Override
    public void visit(Board board) {
        message += board.isFunctional() ? "" : "Board is not functional\n";
        isFunctional &= board.isFunctional();
    }

    @Override
    public void visit(Computer computer) {
        message += computer.isFunctional() ? "" : "computer is not functional\n";
        isFunctional &= computer.isFunctional();
    }

    @Override
    public void visit(CPU cpu) {
        message += cpu.isFunctional() ? "" : "cpu is not functional\n";
        isFunctional &= cpu.isFunctional();
    }

    @Override
    public void visit(RAM ram) {
        message += ram.isFunctional() ? "" : "ram is not functional\n";
        isFunctional &= ram.isFunctional();
    }

    @Override
    public void visit(Mouse mouse) {
        message += mouse.isFunctional() ? "" : "mouse is not functional\n";
        isFunctional &= mouse.isFunctional();
    }
}
