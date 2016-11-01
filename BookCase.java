import java.util.*;

public class Bookcase{
  private String type;
  private ArrayList<Shelfable> shelf;

  public Bookcase(String type) {
    this.type = type;
    this.shelf = new ArrayList<Shelfable>();
  }

  public String getType(){
    return this.type;
  }

  public int bookCount(){
    return this.shelf.size();
  }

  public void addBook(Shelfable thing){
    this.shelf.add(thing);
}
  // public boolean shelfFull(){
  //   return bookCount() == shelf.length;
  // }

  public void sell(){
    this.shelf.clear();
  }

  public Shelfable empty(){
    if (bookCount() > 0){
      return shelf.remove(0);
    }
    return null;
  }


}