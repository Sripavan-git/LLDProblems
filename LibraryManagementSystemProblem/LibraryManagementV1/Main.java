package LibraryManagementSystemProblem.LibraryManagementV1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Admin admin = new Admin("Pavan" , library);
        User user1 = new User("TestUser", library);

        Rack rack1 = new Rack(1);
        Rack rack2 = new Rack(1);

        library.addRack(rack1);
        library.addRack(rack2);

        Book book1 = new Book(1, "Author 1", "Java Programming", 3);
        Book book2 = new Book(2, "Author 2", "Test Book", 50);

        admin.addBook(book1);
        admin.addBook(book2);

        admin.viewAllBooks();

        user1.viewBooksById(1);
        user1.viewBooksByAuthor("Author 1");
        user1.viewBooksByAuthor("Pavan");
        user1.viewBooksbyTitle("Java Programming");
        user1.viewBooksbyTitle("Python Programming");


    }
}
