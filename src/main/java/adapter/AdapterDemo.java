package adapter;

import java.time.LocalDate;

public class AdapterDemo {
    public static void main(String[] args) {
        TVSetModern set = new TVSetModern();
        TVSetAdapter adapter = new TVSetAdapter(set);
        OldController controller = new OldController(adapter);
        controller.setVolume(49);
        System.out.println(set.volume);
        controller.setDate(new DataAdapter(set.date).adapte());
        System.out.println(set.date);
        System.out.println(controller.date);
    }
}
