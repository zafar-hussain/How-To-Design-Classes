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


    @Test
    void thisCity()
    {
        assertFalse(h11.thisCity("zzz")); //basecase
        assertTrue(h21.thisCity("rr"));
    }

    @Test
    void sameCity()
    {
        assertTrue(h11.sameCity(h11));
        assertFalse(h21.sameCity(h11));
    }
}