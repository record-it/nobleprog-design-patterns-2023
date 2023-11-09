package facade;

import lombok.ToString;

@ToString
abstract class ReportItem {
    String content;

    public ReportItem(String content) {
        this.content = content;
    }
}
