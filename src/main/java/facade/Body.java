package facade;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
class Body {
    List<ReportItem> content = new ArrayList<>();

    void addItem(ReportItem item) {
        content.add(item);
    }
}
