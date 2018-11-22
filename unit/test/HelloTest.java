import com.woodwing.workshop.Hello;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

  @Test
  void shouldSayHello() {
    assertEquals("Hello Harry", new Hello("Harry").sayHello());
  }

}