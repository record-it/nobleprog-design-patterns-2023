package chain;

public class TerminalHandler implements RequestHandler{

    @Override
    public void handle(String request) {
        System.out.println("Error! Unknown request!");
    }
}
