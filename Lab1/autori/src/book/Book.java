package book;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<String> authors;

    public Book() {
        this.authors = new ArrayList<>();
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String author) {
        this.authors.add(author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    /*public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("J.K. Rowling");
        book.setTitle("Harry Potter and the Philosopher's Stone");
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
    }*/
}
