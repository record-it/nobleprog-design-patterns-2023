package template;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<AbstractReportTemplate> reports = new ArrayList<>();
        reports.add(new SimpleReport("Java", "Java to użyteczny język"));
        reports.add(new FullHtmlReport("szkolenie wzorce projektowe", "Template", "Wzorzec"));
        reports.forEach(AbstractReportTemplate::print);
    }
}
