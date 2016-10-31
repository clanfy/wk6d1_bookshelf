public class Bookcase{
  private String type;
  private Book[] shelf;
  public Bookcase(String type) {
    this.type = type;
    this.shelf = new Book[13];
  }

  public String getType(){
    return this.type;
  }




}