package ua.hillel.eynicov.lesson17;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    @Test
    void testCalculateAverage() {
        int[] array = {5, 10, 15, 20, 25};
        double expectedAverage = 15.0;

        double actualAverage = ArrayUtils.calculateAverage(array);

        Assertions.assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    void testCalculateAverageWithEmptyArray() {
        int[] emptyArray = {};

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.calculateAverage(emptyArray);
        });
    }

    @Test
    void testIsSquareMatrixWithSquareMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        boolean isSquare = ArrayUtils.isSquareMatrix(matrix);

        Assertions.assertTrue(isSquare);
    }

    @Test
    void testIsSquareMatrixWithNonSquareMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        boolean isSquare = ArrayUtils.isSquareMatrix(matrix);

        Assertions.assertFalse(isSquare);
    }
}