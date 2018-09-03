import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageTest
{
    private Image baseCase = new Image(0, 0, "", "");
    private Image aPortrait = new Image(100, 50, "test", "my house");
    private Image aLandScape = new Image(50, 100, "hi", "low");

    @Test
    void isPortrait()
    {


        assertTrue(baseCase.isPortrait());
        assertTrue(aPortrait.isPortrait());
        assertFalse(aLandScape.isPortrait());

    }
}