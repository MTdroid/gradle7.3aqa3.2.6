import academy.kata.BoundaryService;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BoundaryServiceTest {

    BoundaryService boundaryService = new BoundaryService();

    @ParameterizedTest
    @DisplayName("Find min element in array")
    @Description("testResult must be equals bsResult")
    @MethodSource("arrays")
    public void findmin(int[] arr) {
        int bsResult = boundaryService.findMin(arr);
        int testResult = Arrays.stream(arr).min().getAsInt();
        assertEquals(testResult, bsResult);
    }

    static Stream<int[]> arrays() {
        return Stream.of(new int[]{3, 2, 1, 6, 5, 1, 4, 4}, new int[]{0, 1, 0, 0, 2, 2});
    }
}





