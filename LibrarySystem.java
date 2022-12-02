public class LibrarySystem {

    int bookId;
    String bookName;
    float bookPrice;

    int maxBooks;
    String booksList[];

    public void setBookId(int Id){
        this.bookId = Id;
    }
    public void setBookName(String name){
        this.bookName = name;
    }
    public void setBookPrice(float price){
        bookPrice=price;
    }
    public void totalBooks(int maxBooksNumber){
        booksList = new String [maxBooksNumber];
        maxBooks = maxBooksNumber;
    }
    public void addBooks(String bookName, int Id){
        booksList[Id]=bookName;
        System.out.println("book added successfully");
    }
    public void removeBooks(String bookName,int Id){
        booksList[Id]= null;
    }
    public float getBookPrice(){
        return bookPrice;
    }
    public String[] getBooksList(){
        return booksList;
    }
    public int getMaxBooks(){
        return maxBooks;
    }
    public String getBookName(){
        return bookName;
    }
    public int getBookId(){
        return bookId;
    }

}
