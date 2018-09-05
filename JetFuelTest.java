import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JetFuelTest
{
    // Examples
    JetFuel sale0 = new JetFuel(0, "low", 0); //baseCase
    JetFuel sale1 = new JetFuel(1, "medium", 2);
    JetFuel sale2 = new JetFuel(200000, "high", 400);

    @Test
    void totalCost()
    {
        assertEquals(0, sale0.totalCost()); //baseCase
        assertEquals(1 * 2, sale1.totalCost());
        assertEquals(200000 * 400, sale2.totalCost());
    }


    @Test
    void discountPrice()
    {
        assertEquals(sale0.totalCost(), sale0.discountPrice());
        assertEquals(sale1.totalCost(), sale1.discountPrice());
        assertEquals(sale2.totalCost() - (sale2.totalCost() * 0.1), sale2.discountPrice());
    }
}