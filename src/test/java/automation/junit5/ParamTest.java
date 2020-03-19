package automation.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTest {
@Tag("smoke")
    @ParameterizedTest
    @ValueSource(ints = {5, 1, 3, 666})
    public void test(int i) {
        Assertions.assertTrue(i > 0);
    }

}