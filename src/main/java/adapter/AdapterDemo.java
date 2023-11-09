package adapter;

import java.time.LocalDate;

public class AdapterDemo {
    public static void main(String[] args) {
        TVSet set = new TVSet();
        Controller controller = new Controller();
        TVSetAdapter adapter = new TVSetAdapterImpl(set);
        controller.setVolume(45, adapter);
        System.out.println(set.volume);
        controller.setDate(new DataAdapter(set.date).adapte());
        controller.setDate(LocalDate.of(1900 + set.date.getYear(),set.date.getMonth() + 1, set.date.getDate()));
        System.out.println(set.date);
        System.out.println(controller.date);
    }
}
