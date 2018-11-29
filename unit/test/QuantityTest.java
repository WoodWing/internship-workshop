import com.woodwing.workshop.Quantity;
import org.junit.jupiter.api.Test;

import static com.woodwing.workshop.Unit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QuantityTest {

    @Test
    void shouldEquals() {
        // Test beer
        assertEquals(VASE.s(2), SMALL.s(4));
        assertEquals(CRATE.s(1), SMALL.s(60));
        assertEquals(TANKWAGON.s(1), CRATE.s(8400));
        assertEquals(PITCHER.s(10), CRATE.s(2));
        assertNotEquals(VASE.s(1), TANKWAGON.s(1));

        // Test distances
        assertEquals(INCH.es(12), FOOT.s(1));
        assertEquals(FURLONG.s(2), FOOT.s(1320));
        assertEquals(INCH.es(63360), MILE.s(1));
        assertNotEquals(INCH.es(1), FOOT.s(12));
    }

    @Test
    void shouldThrow() {
        Quantity distanceQuantity = INCH.es(4);
        Quantity beerQuantity = VASE.s(7);

        assertThrows(IllegalArgumentException.class, () -> distanceQuantity.equals(beerQuantity));
        assertThrows(IllegalArgumentException.class, () -> distanceQuantity.plus(beerQuantity));
    }

    @Test
    void shouldDoArithmetic() {
        assertEquals(INCH.es(2), INCH.es(1).plus(INCH.es(1)));
        assertEquals(INCH.es(-1), INCH.es(1).negate());
        assertEquals(INCH.es(1), INCH.es(2).minus(INCH.es(1)));
    }
}
