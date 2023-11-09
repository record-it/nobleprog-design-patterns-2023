package singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
        System.out.println(EnumSingleton.getInstance());
        System.out.println(EnumSingleton.getInstance());
    }
}
