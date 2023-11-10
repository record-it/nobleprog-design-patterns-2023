package visitor;

public class CPU implements Visitable{
    @Override
    public void accept(Visitor visitor) {
        System.out.println("accept");
        visitor.visit(this);
    }

    @Override
    public boolean isFunctional() {
        return true;
    }
    @Override
    public String toString() {
        return "CPU i712000";
    }
}
