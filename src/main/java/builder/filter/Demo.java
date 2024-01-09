package builder.filter;

import java.util.List;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        List<Book> books = List.of(
                Book.builder()
                        .title("ABC")
                        .pages(34)
                        .author("abc")
                        .build(),
                Book.builder()
                        .title("CDE")
                        .pages(123)
                        .author("cde")
                        .build(),
                Book.builder()
                        .title("ERT")
                        .pages(89)
                        .author("ert")
                        .build()
        );
        StringFilter filter = StringFilter.builder()
                .minLength(1)
                .maxLength(5)
                .contains("C")
                .build();
        System.out.println(filter);
        Predicate<String> predicate = filter.buildPredicate();

        boolean abc = predicate.test("ABC");
        System.out.println(abc);
        books.stream().filter(b -> filter.buildPredicate().test(b.getTitle())).forEach(System.out::println);
    }
}
