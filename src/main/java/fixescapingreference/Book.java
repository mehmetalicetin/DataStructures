package fixescapingreference;

public class Book implements BookReadOnly{
  private int id;
  private String title;
  private String author;
  private Price price;

  public Book(int id, String title, String author, Double price) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.price = new Price(price);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  //TODO: check if Price is immutable.
  public Price getPrice() {
    return price;
  }

  //This method shows that this class is not immutable class.
  public void setPrice(Price price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book{" + "id=" + id + ", title='" + title + '\'' + ", author='" + author + '\'' + ", price=" + price + '}';
  }
}
