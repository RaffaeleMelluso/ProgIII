package book;
import java.util.Scanner;

public class io {
    public Book ImputUserInterface(){
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Please enter the title of the book: ");
        String title = scanner.nextLine();
        book.setTitle(title);
        System.out.println("Please enter the authors of the book separated by \",\" ");
        String authors = scanner.nextLine();
        String[] authorsArray = authors.split(",");
        for (String author : authorsArray) {
            book.addAuthor(author);
        }
        return book;
    }
    public void PrettyPrinter(Book book){
        System.out.println("Title: " + book.getTitle());
        System.out.println("Authors: ");
        for (String author : book.getAuthors()) {
            System.out.println(author);
        }

    }
}
