package visitor;

public class Mouse implements Visitable{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean isFunctional() {
        return true;
    }

    @Override
    public String toString() {
        return "Mouse";
    }
}
