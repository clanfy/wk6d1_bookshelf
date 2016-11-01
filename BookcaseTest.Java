import static org.junit.Assert.*;
import org.junit.*;

public class BookcaseTest{
  Bookcase bookcase;
  Book book;
  KnickKnack knickKnack;

  @Before
  public void before(){
    bookcase = new Bookcase("Oak");
    book = new Book();
    knickKnack = new KnickKnack();
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

  // @Test
  // public void cantAddWhenShelfFull(){
  //   for (int i = 0; i < 20; i++){
  //     bookcase.addBook(book);
  //   }
  //   assertEquals(13, bookcase.bookCount());
  // }

  // @Test
  // public void shelfIsFull(){
  //   for (int i = 0; i < 13 ; i++ ){
  //     bookcase.addBook(book);
  //   }
  //   assertEquals(13, bookcase.bookCount());
  // }

  // @Test 
  // public void SellBooksAfterFullShelf(){
  //   bookcase.addBook(book);
  //   assertEquals(1, bookcase.bookCount());
  //   bookcase.sell();
  //   assertEquals(0, bookcase.bookCount());
  // }

  @Test
  public void shouldEmptyShelfAfterSelling(){
    bookcase.addBook(book);
    bookcase.addBook(knickKnack);
    bookcase.sell();
    assertEquals(bookcase.bookCount(), 0);
  }

  @Test 
  public void canEmpty(){
    bookcase.addBook(book);
    Shelfable thing = bookcase.empty();
    assertNotNull(thing);
  }

  @Test
  public void canGetBookBack(){
    bookcase.addBook(book);
    Shelfable thing = bookcase.empty();
    Book first = (Book) thing;
    assertEquals("book shelved", first.shelf());
  }

  @Test
  public void canGetKnickKnackBack(){
    bookcase.addBook(knickKnack);
    Shelfable thing = bookcase.empty();
    KnickKnack first = (KnickKnack) thing;
    assertEquals("knickknack shelved", first.shelf());
  }


}