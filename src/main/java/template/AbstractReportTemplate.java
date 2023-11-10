package template;

abstract public class AbstractReportTemplate {

    abstract protected void header();
    abstract protected void title();
    abstract protected void content();
    abstract protected void sing();
    abstract protected void footer();
    public void print(){
        header();
        title();
        content();
        sing();
        footer();
    }
}
