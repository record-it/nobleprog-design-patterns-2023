package adapter;
import java.time.LocalDate;
import java.util.Date;

public class DataAdapter {
    private final Date adaptee;


    public DataAdapter(Date adaptee) {
        this.adaptee = adaptee;
    }

    public LocalDate adapte() {
        return LocalDate.of(adaptee.getYear(), adaptee.getMonth() + 1, adaptee.getDate());
    }
}
