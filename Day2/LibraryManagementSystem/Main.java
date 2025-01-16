public class Main {
    public static void main(String[] args) {
        
        Library library = new Library();
        Book book1 = new Book("Java Programming", "James Gosling", "123456");
        Book book2 = new Book("Data Structures", "Robert Sedgewick", "654321");
        library.addBook(book1);
        library.addBook(book2);
        System.out.println("Library Inventory:");
        library.displayLibrary();
        library.borrowBook("123456");
        library.borrowBook("123456");
        library.returnBook("123456");
        System.out.println("\nLibrary Inventory after borrowing and returning:");
        library.displayLibrary();
    }
}
        
        

        
        

       

        
        

        
        
