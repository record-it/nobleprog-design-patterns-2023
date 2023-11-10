package visitor;

public interface Visitable {
    void accept(Visitor visitor);
    boolean isFunctional();
}
