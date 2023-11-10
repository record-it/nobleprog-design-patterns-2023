package chain;

public class FanHandler implements RequestHandler{
    private final RequestHandler next;

    public FanHandler(RequestHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String request) {
        if (request.contains("fan on")){
            System.out.println("Fan is working");
        } else
        if (request.contains("fan off")){
            System.out.println("Fan stop");
        } else {
            next.handle(request);
        }
    }
}
