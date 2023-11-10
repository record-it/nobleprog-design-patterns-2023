package chain;
// zdefiniuj klasę WaterHandler reagującą na request "water"
// komunikatem "Open water"
// włącz obiekt tej klasy do łańcucha za fanHandler'em
public class Demo {
    public static void main(String[] args) {
        RequestHandler fanHandler = new FanHandler(new TerminalHandler());
        RequestHandler boilerHandler = new BoilerHandler(fanHandler);
        boilerHandler.handle("set temperature\t56.7");
        boilerHandler.handle("fan on");
        boilerHandler.handle("xxx");
        boilerHandler.handle("fan off");
    }
}
