import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageTest
{
    private Image baseCase = new Image(0, 0, "", "");
    private Image aPortrait = new Image(100, 50, "test", "my house");
    private Image aLandScape = new Image(60, 100, "hi", "low");

    @Test
    void isPortrait()
    {
        assertTrue(baseCase.isPortrait());
        assertTrue(aPortrait.isPortrait());
        assertFalse(aLandScape.isPortrait());
    }

    @Test
    void size()
    {
        assertEquals(0, baseCase.size());
        assertEquals(5000, aPortrait.size());
        assertEquals(6000, aLandScape.size());
    }

    @Test
    void isLarger()
    {
        assertFalse(baseCase.isLarger(aPortrait));
        assertTrue(aLandScape.isLarger(baseCase));
        assertTrue(aPortrait.isLarger(aPortrait));
    }

    @Test
    void same()
    {
        assertTrue(baseCase.same(baseCase));
        assertFalse(baseCase.same(aPortrait));
        assertFalse(aPortrait.same(aLandScape));
    }
}