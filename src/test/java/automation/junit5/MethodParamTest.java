package automation.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class MethodParamTest {

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void test(String s1, String s2) {
        Assertions.assertEquals(s1, s2);
    }

    private static Stream<Arguments> dataProvider() {
        return Stream.of(Arguments.of("cat", "cat"));
    }
}