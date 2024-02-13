package escapingreferances;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
  private List<Book> books;

  public BookCollection() {
    books = new ArrayList<>();
    books.add(new Book(1,"Tom Jonas", "Henry Fielding", 9.99));
  }

  //TODO: fix escaping reference
  public Book findBookByName(String title){
    for (Book book : books){
      if(book.getTitle().equalsIgnoreCase(title))
        return book;
    }
    return null;
  }

  public void printAllBooks(){
    books.forEach(System.out::println);
  }
}
