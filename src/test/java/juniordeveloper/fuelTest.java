package juniordeveloper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class fuelTest {

    @Test
    void checkFuelCalculation() {
        assertEquals(2, Main.fuelCalculation(12), "Fuel result for mass 12 should be 2");
        assertEquals(2, Main.fuelCalculation(14), "Fuel result for mass 14 should be 2");
        assertEquals(654, Main.fuelCalculation(1969), "Fuel result for mass 1969 should be 654");
        assertEquals(33583, Main.fuelCalculation(100756), "Fuel result for mass 100756 should be 33583");
    }
}