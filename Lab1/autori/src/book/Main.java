package book;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Book Manager!");
        io io = new io();
        Book book=io.ImputUserInterface();
        io.PrettyPrinter(book);
        

    }
}
