import com.woodwing.workshop.Biertjes;
import org.junit.jupiter.api.Test;

import static com.woodwing.workshop.Biertjes.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BierTest {
    @Test
    void shouldEquals() {
        assertEquals(new Biertjes(VAASJE, 2), new Biertjes(KLEINTJE, 4));
        assertEquals(new Biertjes(KRAT, 1), new Biertjes(KLEINTJE, 60));
        assertEquals(new Biertjes(TANKWAGEN, 1), new Biertjes(KRAT, 8400));
        assertEquals(new Biertjes(PITCHER, 10), new Biertjes(KRAT, 2));
        assertNotEquals(new Biertjes(VAASJE, 1), new Biertjes(TANKWAGEN, 1));
    }
}
