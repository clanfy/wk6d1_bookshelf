import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BookcaseTest{
  Bookcase bookcase;
  Book book;

  @Before
  public void before(){
    bookcase = new Bookcase("Oak");
    book = new Book();
  }

  @Test
  public void hasType(){
    assertEquals( "Oak", bookcase.getType() );
  }

  @Test 
  public void shelfStartsEmpty(){
    assertEquals(0, bookcase.bookCount());
  }

  @Test
  public void canAddBook(){
    bookcase.addBook(book);
    assertEquals(1, bookcase.bookCount());
  }

  @Test
  public void cantAddWhenShelfFull(){
    for (int i = 0; i < 20; i++){
      bookcase.addBook(book);
    }
    assertEquals(13, bookcase.bookCount());
  }

  @Test
  public void shelfIsFull(){
    for (int i = 0; i < 13 ; i++ ){
      bookcase.addBook(book);
    }
    assertEquals(13, bookcase.bookCount());
  }



}