package proxy;

public class Demo {
    public static void main(String[] args) {
        Matrix matrix= new MatrixProxy();
        matrix.set(5, 0, 1);
        matrix.set(7, 1, 1);
        System.out.println("Utworzenie realnego obiektu");
        matrix.set(9, 4, 6);
    }
}
