import org.junit.jupiter.api.Test;
import uk.co.monotonic.testing.junit5.before.m2.Cafe;
import uk.co.monotonic.testing.junit5.before.m2.Coffee;
import uk.co.monotonic.testing.junit5.before.m2.CoffeeType;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CafeTest {
    @Test
    public void shouldBrewEspresso() {
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);
        Coffee coffee = cafe.brew(CoffeeType.Espresso);
        assertEquals(7, coffee.getBeans());
        assertEquals(0, coffee.getMilk());
        assertEquals(CoffeeType.Espresso, coffee.getType());
    }

}
