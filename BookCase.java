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

  public int bookCount(){

    int counter = 0;

    for(Book book : shelf) {
      if (book != null) {
        counter++;
      }
    }
    return counter;
  }

  public void addBook(Book book){
    if (shelfFull()) {
      return;
    }
    int nextEmptyIndex = bookCount();
    shelf[nextEmptyIndex] = book;
  }

  public boolean shelfFull(){
    return bookCount() == shelf.length;
  }

  public void sell(){
    for (int i = 0; i < shelf.length; i++ ) {
      shelf[i] = null;
      
    }
  }




}