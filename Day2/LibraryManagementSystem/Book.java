public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean availability;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availability = true; 
    }    
    public boolean borrowBook() {
        if (availability) {
            availability = false; 
            System.out.println("Book borrowed: " + title);
            return true;
        } else {
            System.out.println("Book not available: " + title);
            return false;
        }
    }
    public void returnBook() {
        availability = true;  
        System.out.println("Book returned: " + title);
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }
    public String getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
}
    
    

    
    

    
    

    
    
