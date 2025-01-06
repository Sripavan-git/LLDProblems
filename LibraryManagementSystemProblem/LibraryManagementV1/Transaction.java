package LibraryManagementSystemProblem.LibraryManagementV1;

import java.util.Date;

public class Transaction {

    private User user;
    private Book book;
    private BookType bookType;
    private Date date;

    public Transaction(User user, Book book, BookType bookType) {
        this.user = user;
        this.book = book;
        this.bookType = bookType;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "user=" + user +
                ", book=" + book +
                ", bookType=" + bookType +
                ", date=" + date +
                '}';
    }
}
