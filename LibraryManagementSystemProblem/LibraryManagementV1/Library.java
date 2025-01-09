package LibraryManagementSystemProblem.LibraryManagementV1;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Rack> racks;

    public Library(){
        this.racks = new ArrayList<>();
    }
    public void addRack(Rack rack){
        racks.add(rack);
    }
    public void addBook(Book book){
        for(Rack rack : racks){
            if(!rack.getBook().isPresent()){
                //System.out.println("Adding books.................");
                rack.addBook(book);
                System.out.println("Book \"" + book.getTitle() + "\" added to rack " + rack.getId());
                return;
            }
        }
    }

    public void viewBooks(){
        for(Rack rack : racks){
            if(rack.getBook().isPresent()){
                Book book = rack.getBook().get();
                System.out.println("Book ID: " + book.getId() + ", Name: " + book.getTitle() + ", Author: " + book.getAuthor()
                + ", Copies : " + book.getCopies());
            }
        }
    }

    public void viewBookById(int id){
        for(Rack rack : racks){
            if(rack.getBook().isPresent() && rack.getBook().get().getId() == id){
                Book book = rack.getBook().get();
                System.out.println("Book ID: " + book.getId() + ", Name: " + book.getTitle() + ", Author: " + book.getAuthor()
                        + ", Copies : " + book.getCopies());
                return;
            }
        }
        System.out.println("Book with Id "+ id + " not Found");
    }

    public void viewBookByAuthor(String author){
        Boolean isFound = false;
        for(Rack rack : racks){
            if(rack.getBook().isPresent() && rack.getBook().get().getAuthor().equals(author)){
                Book book = rack.getBook().get();
                System.out.println("Book ID: " + book.getId() + ", Name: " + book.getTitle() + ", Author: " + book.getAuthor()
                        + ", Copies : " + book.getCopies());
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("Book with Author "+ author + " not Found");
        }
    }

    public void viewBookByTitle(String title){
        Boolean isFound = false;
        for(Rack rack : racks){
            if(rack.getBook().isPresent() && rack.getBook().get().getTitle().equals(title)){
                Book book = rack.getBook().get();
                System.out.println("Book ID: " + book.getId() + ", Name: " + book.getTitle() + ", Author: " + book.getAuthor()
                        + ", Copies : " + book.getCopies());
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("Book with Title " + title + " not found");
        }
    }
}
