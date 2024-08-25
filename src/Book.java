public class Book {

    private String bookTitle;

    private int yearOfPublication;

    private Author author;

    public Book(String bookTitle, int yearOfPublication, Author author) {
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
