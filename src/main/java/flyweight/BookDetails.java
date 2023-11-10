package flyweight;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDetails {
    private String title;
    private String author;
    private String isbn;
    private int editionYear;
}
