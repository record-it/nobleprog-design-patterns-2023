package visitor;

public class RAM implements Visitable{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean isFunctional() {
        return false;
    }

    @Override
    public String toString() {
        return "RAM 32GB";
    }
}
