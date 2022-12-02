public class Main {
    public static void main(String[] args) {
LibrarySystem book1 = new LibrarySystem();
LibrarySystem book2 = new LibrarySystem();


        book1.setBookName("History of Addis Ababa");
        book1.setBookId(3435);
        book1.setBookPrice(130.65f);

        book2.setBookName("Computer Science");
        book2.setBookId(4563);
        book2.setBookPrice(230.43f);


        System.out.println(book1.getBookId());
        System.out.println(book1.getBookName());
        System.out.println(book1.getBookPrice());

        System.out.println(book2.getBookId());
        System.out.println(book2.getBookName());
        System.out.println(book2.getBookPrice());


    }
}
