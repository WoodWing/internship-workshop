import com.woodwing.workshop.Distance;
import org.junit.jupiter.api.Test;

import static com.woodwing.workshop.Distance.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DistanceTest {
    @Test
    void shouldEquals() {
        assertEquals(new Distance(INCH, 12), new Distance(FOOT, 1));
        assertEquals(new Distance(FURLONG, 2), new Distance(FOOT, 1320));
        assertEquals(new Distance(INCH, 63360), new Distance(MILE, 1));
        assertNotEquals(new Distance(INCH, 1), new Distance(FOOT, 12));
    }
}
