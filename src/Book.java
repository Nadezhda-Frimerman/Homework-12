import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int yearOfPublishing;

    public Book(String title, Author author, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setYearOfPublishing(int year) {
        this.yearOfPublishing = year;
    }

        public int hashCode(){
        return Objects.hash (title,author,yearOfPublishing);
    }

        public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Book book = (Book) a;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    public String toString(){
        return String.format("Book: title - %s, author - %s, year - %s", title,author,yearOfPublishing);
    }


}
