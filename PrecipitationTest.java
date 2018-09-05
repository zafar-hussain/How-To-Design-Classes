import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrecipitationTest
{
    // Examples

    Precipitation p0 = new Precipitation(0, 0, 0); // baseCase
    Precipitation p1 = new Precipitation(100, 200, 300);
    Precipitation p2 = new Precipitation(4, 5, 6);

    @Test
    void cumulative()
    {
        assertEquals(0, p0.cumulative());
        assertEquals(100 + 200 + 300, p1.cumulative());
        assertEquals(4 + 5 + 6, p2.cumulative());
    }

    @Test
    void average()
    {
        assertEquals(p0.cumulative() / 3, p0.average());
        assertEquals(p1.cumulative() / 3, p1.average());
        assertEquals(p2.cumulative() / 3, p2.average());
    }
}