package LibraryManagementSystemProblem.LibraryManagementV1;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;
    private List<User> userList;
    private List<Transaction> transactionList;

    public Library(){
        this.bookList = new ArrayList<>();
        this.userList = new ArrayList<>();
        this.transactionList = new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public void addUser(User user){
        userList.add(user);
    }

    public String borrowBook(User user, Book book){
        if(book.getIsAvaibleToBorrow()){
            book.setIsAvaibleToBorrow(false);
            Transaction transaction = new Transaction(user, book, BookType.BORROW);
            transactionList.add(transaction);
            return "Book borrowed successfully";
        }
        else{
            return "Book is not available to Borrow";
        }
    }

    public String returnBook(User user, Book book){
        book.setIsAvaibleToBorrow(true);
        Transaction transaction = new Transaction(user, book, BookType.RETURN);
        transactionList.add(transaction);
        return "Book returned Successfully";
    }

    public void viewBooks(){
        for(Book book : bookList){
            System.out.println(book);
        }
    }
}
