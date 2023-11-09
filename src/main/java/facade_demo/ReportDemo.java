package facade_demo;

import facade.ReportFacade;

import java.util.List;

public class ReportDemo {
    public static void main(String[] args) {
        ReportFacade report = new ReportFacade();
        report.addHeader("Hello Java");
        report.addParagraphs(List.of("Java", "Design Patterns", "Lambda"));
        report.addFooter("NobleProg");
        System.out.println(report);
    }
}
