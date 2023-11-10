package adapter.example3;

import adapter.example2.TVSetModern;
import adapter.example2.OldController;
import adapter.example2.TVSetAdapterForOldInterface;

public class Demo {
    public static void main(String[] args) {
        TVSetModern set = new TVSetModern();
        TVSetAdapterForOldInterface adapter = new TVSetAdapterForOldInterface(set);
        OldController controller = new OldController(adapter);
        DataAdapter dataAdapter = new DataAdapter(set.getDate());
        // kod zastany
        controller.setDate(dataAdapter.adapte());
        System.out.println(controller.getDate());
        System.out.println(set.getDate());
    }
}
