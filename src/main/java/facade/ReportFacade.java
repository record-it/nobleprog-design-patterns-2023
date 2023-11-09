package facade;

import java.util.List;

public class ReportFacade {
    Body body = new Body();
    public  void addHeader(String content){
        body.addItem(new Header(content, 1));
    }

    public void addParagraphs(List<String> contents){
        for(String str: contents){
            body.addItem(new Paragraph(str));
        }
    }

    public void addFooter(String content){
        body.addItem(new Header(content, 5));
    }

    @Override
    public String toString() {
        return body.content.get(0).content;
    }
}
