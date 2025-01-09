package LibraryManagementSystemProblem.LibraryManagementV1;

public class Book {

    private int id;
    private String author;
    private String title;
    private int copies;

    public Book(int id, String author, String title, int copies) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.copies = copies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", copies=" + copies +
                '}';
    }
}
