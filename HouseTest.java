import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest
{
    // House examples

    House h11 = new House("Ground", 4, 211, 34, "sss", "fff");
    House h21 = new House("Flat", 1, 33, 66, "dd", "rr");

    @Test
    void isBigger()
    {
        assertTrue(h11.isBigger(h21));
        assertFalse(h21.isBigger(h11));
    }
}