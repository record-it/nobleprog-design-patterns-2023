package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<BooItem> library = new ArrayList<>();
        BookDetails details = BookDetails
                .builder()
                .author("Bloch")
                .title("Effective Java")
                .editionYear(2020)
                .isbn("928479348793")
                .build();
        BooItem item = BooItem
                .builder()
                .details(details)
                .libraryId(45)
                .rentCounter(5)
                .build();
        library.add(item);
        library.add(
                BooItem
                        .builder()
                        .details(details)
                        .libraryId(67)
                        .rentCounter(0)
                        .build()
        );
    }
}
