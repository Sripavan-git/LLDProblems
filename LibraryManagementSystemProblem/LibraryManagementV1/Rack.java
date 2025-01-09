package LibraryManagementSystemProblem.LibraryManagementV1;

import java.util.Optional;

public class Rack {

    private int id;
    private Optional<Book> book;

    public Rack(int id){
        this.id = id;
        this.book =Optional.empty();
    }

    public int getId(){
        return id;
    }

    public Optional<Book> getBook(){
        return book;
    }

    public void addBook(Book book){
        if(this.book.isPresent()){
            System.out.println("Rack with " + id + " already has a book");
        }
        else{
            this.book = Optional.of(book);
        }
    }

    public void removeBook(){
        this.book = Optional.empty();
    }
}
