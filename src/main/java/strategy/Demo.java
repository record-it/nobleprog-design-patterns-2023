package strategy;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client(new VatTax(20000, 0.08), "Karol"));
        clients.add(new Client(new ScaleTax(140_000, 23_000, 3), "Adam"));

        for(var c: clients){
            System.out.println(c.getName() +" has tax: " + c.getTax().calculate());
        }
    }
}
