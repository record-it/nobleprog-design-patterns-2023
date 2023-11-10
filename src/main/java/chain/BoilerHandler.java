package chain;

public class BoilerHandler implements RequestHandler{
    private final RequestHandler next;

    public BoilerHandler(RequestHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String request) {
        if (request.contains("set temperature")){
            double temp = Double.parseDouble(request.split("\t")[1]);
            System.out.println("Boiler ser temperature to " + temp);
        } else {
            next.handle(request);
        }
    }
}
