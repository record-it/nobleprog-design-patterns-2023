package adapter.example3;
import java.time.LocalDate;
import java.util.Date;

public class DataAdapter {
    private final LocalDate adaptee;


    public DataAdapter(LocalDate adaptee) {
        this.adaptee = adaptee;
    }

    public Date adapte() {
        return new Date(adaptee.getYear() - 1900, adaptee.getMonthValue() - 1, adaptee.getDayOfMonth());
    }
}
