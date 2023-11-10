package flyweight;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BooItem {
    private int libraryId;
    private int rentCounter;
    private BookDetails details;
}
