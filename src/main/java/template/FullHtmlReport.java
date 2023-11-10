package template;

public class FullHtmlReport extends AbstractReportTemplate{
    private final String header;
    private final String title;
    private final String content;

    public FullHtmlReport(String header, String title, String content) {
        this.header = header;
        this.title = title;
        this.content = content;
    }

    @Override
    protected void header() {
        System.out.println("<p>" + header + "</p>");
    }

    @Override
    protected void title() {
        System.out.println("<h1>" + title + "</h1");
    }

    @Override
    protected void content() {

    }

    @Override
    protected void sing() {
        System.out.println("<span>CS</span>");
    }

    @Override
    protected void footer() {
        System.out.println("<footer>Created by NobleProg</footer>");
    }
}
