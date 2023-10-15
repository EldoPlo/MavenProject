import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest
{
    @Test
    public void testReturn2()
    {
        assertEquals(2, Main.return2());
        assertNotEquals(20, Main.return2());
    }
}
