package facade;

import lombok.ToString;

@ToString
class Header extends ReportItem{
    int level;
    public Header(String content, int level) {
        super(content);
        this.level = level;
    }
}
