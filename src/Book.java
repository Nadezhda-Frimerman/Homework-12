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
}
