package fixescapingreference;

public class Main {
  public static void main(String[] args) {
    BookCollection bookCollection = new BookCollection();
    bookCollection.printAllBooks();
    System.out.println(bookCollection.findBookByName("Tom Jonas").getPrice().convert("EUR"));
    bookCollection.printAllBooks();
  }
}
