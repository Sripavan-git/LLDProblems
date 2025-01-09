package LibraryManagementSystemProblem.LibraryManagementV1;

public class Admin {

    private String name;
    private Library library;


    public Admin(String name, Library library){
        this.library = library;
        this.name = name;
    }

    public void addBook(Book book){
        library.addBook(book);
    }

    public void viewAllBooks(){
        library.viewBooks();
    }
}
