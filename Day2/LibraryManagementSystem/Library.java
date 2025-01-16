import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }
    public void displayLibrary() {
        for (Book book : books) {
            book.displayDetails();
            System.out.println();
        }
    }
    public boolean borrowBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book.borrowBook();
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
        return false;
    }
    public void returnBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }
}
    

   
    

    
    

   
    
