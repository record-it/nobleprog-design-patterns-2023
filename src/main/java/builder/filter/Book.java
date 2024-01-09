package builder.filter;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Book {
    private String title;
    private String author;
    private int pages;
}
