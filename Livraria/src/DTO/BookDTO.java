package DTO;

/**
 *
 * @author Reddingtom
 */
public class BookDTO {

    private int id_book, pages;
    private String Title, author, isbn;
    private double price;

    public int getId_book() {
        
        return id_book;
        
    }

    public void setId_book(int id_book) {
        
        this.id_book = id_book;
        
    }

    public int getPages() {
        
        return pages;
        
    }

    public void setPages(int pages) {
        
        this.pages = pages;
    }

    public String getTitle() {
        
        return Title;
        
    }

    public void setTitle(String Title) {
        
        this.Title = Title;
        
    }

    public String getAuthor() {
        
        return author;
        
    }

    public void setAuthor(String author) {
        
        this.author = author;
        
    }

    public String getIsbn() {
        
        return isbn;
        
    }

    public void setIsbn(String isbn) {
        
        this.isbn = isbn;
        
    }

    public double getPrice() {
        
        return price;
        
    }

    public void setPrice(double price) {
        
        this.price = price;
        
    }
    
}
