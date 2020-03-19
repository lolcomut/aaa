package automation.junit5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LolaTest {

    @Test
    public void test() {
        Assertions.assertEquals(2, 1 + 1);
    }
}
