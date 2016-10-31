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



}