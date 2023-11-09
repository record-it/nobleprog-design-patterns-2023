package facade;

import lombok.ToString;

@ToString
class Paragraph extends ReportItem{

    public Paragraph(String content) {
        super(content);
    }
}
