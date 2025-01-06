package LibraryManagementSystemProblem.LibraryManagementV1;

public class Book {

    private int id;
    private String author;
    private String title;
    private boolean isAvaibleToBorrow;

    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvaibleToBorrow = true;
    }

    public boolean getIsAvaibleToBorrow(){
        return isAvaibleToBorrow;
    }

    public void setIsAvaibleToBorrow(boolean isAvaibleToBorrow){
        this.isAvaibleToBorrow = isAvaibleToBorrow;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isAvaibleToBorrow=" + isAvaibleToBorrow +
                '}';
    }
}
