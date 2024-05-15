package n1exercici1test;

import org.example.n1exercici1.Main;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MonthTest {

    @Test
    public void checkListSize() {
        assertEquals(12, Main.readList().size());
    }

    @Test
    public void checkIsNotNull() {
        assertNotNull(Main.readList());
    }

    @Test
    public void checkIndex() {
        assertEquals("August", Main.readList().get(8 - 1).getName());

    }
}
