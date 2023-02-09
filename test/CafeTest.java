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
        Coffee brew = cafe.brew(CoffeeType.Espresso);
    }

}
