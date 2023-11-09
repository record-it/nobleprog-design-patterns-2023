package builder;

public class BookLombokBuilderDemo {
    public static void main(String[] args) {
        Book book = Book.builder()
                .title("null")
                .author("Adam")
                .build();
        System.out.println(book);
    }
}
