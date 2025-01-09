package LibraryManagementSystemProblem.LibraryManagementV1;

public class User {
    private int id;
    private String name;
    private Library library;

    public User(String name, Library library){
        this.name = name;
        this.library = library;
    }

    public String getUser(){
        return name;
    }

    public void viewBooks(){
        library.viewBooks();
    }
    public void viewBooksById(int id){
        library.viewBookById(id);
    }
    public void viewBooksByAuthor(String author){
        library.viewBookByAuthor(author);
    }
    public void viewBooksbyTitle(String title){
        library.viewBookByTitle(title);
    }

}
