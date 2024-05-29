package n1exercici3test;

import org.example.n1exercici3.Main;
import org.junit.Test;

public class MainTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void error(){
        Main.error();
    }
}
