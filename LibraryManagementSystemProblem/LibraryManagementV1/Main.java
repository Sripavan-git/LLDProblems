package LibraryManagementSystemProblem.LibraryManagementV1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User user1 = new User(1, "Pavan");
        User user2 = new User(2, "Test");

        library.addUser(user1);
        library.addUser(user2);

        Book book1 = new Book(101, "Java Programming", "Test Author");
        Book book2 = new Book(102, "Python Programming", "Test author 2");

        library.addBook(book1);
        library.addBook(book2);
        System.out.println("Books in the Library:");
        library.viewBooks();
        System.out.println("\n" + library.borrowBook(user1, book1)); // Alice borrows Java Programming
        library.viewBooks();
        System.out.println("\n" + library.borrowBook(user2, book1)); // Bob tries to borrow the same book

        System.out.println("\n" + library.returnBook(user1, book1)); // Alice returns Java Programming
        library.viewBooks();
    }
}
