package builder;

import lombok.*;

@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Book {
    @NonNull
    @Getter
    private final String title;
    @Getter
    private final String author;
    @Getter
    private final int editionYear;

    @EqualsAndHashCode.Include
    private final String isbn;
}
