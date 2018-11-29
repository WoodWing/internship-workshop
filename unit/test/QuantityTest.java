import com.woodwing.workshop.Quantity;
import org.junit.jupiter.api.Test;

import static com.woodwing.workshop.Quantity.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class QuantityTest {

    @Test
    void shouldEquals() {
        // Test beer
        assertEquals(new Quantity(VAASJE, 2), new Quantity(KLEINTJE, 4));
        assertEquals(new Quantity(KRAT, 1), new Quantity(KLEINTJE, 60));
        assertEquals(new Quantity(TANKWAGEN, 1), new Quantity(KRAT, 8400));
        assertEquals(new Quantity(PITCHER, 10), new Quantity(KRAT, 2));
        assertNotEquals(new Quantity(VAASJE, 1), new Quantity(TANKWAGEN, 1));

        // Test distances
        assertEquals(new Quantity(INCH, 12), new Quantity(FOOT, 1));
        assertEquals(new Quantity(FURLONG, 2), new Quantity(FOOT, 1320));
        assertEquals(new Quantity(INCH, 63360), new Quantity(MILE, 1));
        assertNotEquals(new Quantity(INCH, 1), new Quantity(FOOT, 12));
    }
}
