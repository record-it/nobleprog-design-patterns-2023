package template;

public class SimpleReport extends AbstractReportTemplate{
    private final String title;
    private final String content;

    public SimpleReport(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void header() {

    }

    @Override
    public void title() {
        System.out.println(title);
        System.out.println("-".repeat(title.length()));
    }

    @Override
    public void content() {
        System.out.println();
        System.out.println(content.indent(5));
        System.out.println();
    }

    @Override
    public void sing() {

    }

    @Override
    public void footer() {

    }
}
