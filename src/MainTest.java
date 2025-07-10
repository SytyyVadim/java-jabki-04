import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testSumArray() {
        int[] input = {1, 2, 3, 4};
        assertEquals(10, Main.sumArray(input));
    }

    @Test
    void testFindMin() {
        int[] input = {5, 3, 7, 1, 9};
        assertEquals(1, Main.findMin(input));
    }

    @Test
    void testGetMonthsStartingWithM() {
        String[] months = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };
        assertEquals("Март, Май", Main.getMonthsStartingWithM(months));
    }

    @Test
    void testReverseArray() {
        int[] input = {1, 2, 3, 4};
        Main.reverseArray(input);
        assertArrayEquals(new int[]{4, 3, 2, 1}, input);
    }

    @Test
    void testHasDuplicatesTrue() {
        int[] input = {1, 2, 3, 2};
        assertTrue(Main.hasDuplicates(input));
    }

    @Test
    void testHasDuplicatesFalse() {
        int[] input = {1, 2, 3, 4};
        assertFalse(Main.hasDuplicates(input));
    }

    @Test
    void testReplaceNegativesWithAbs() {
        int[] input = {-1, 2, -3};
        Main.replaceNegativesWithAbs(input);
        assertArrayEquals(new int[]{1, 2, 3}, input);
    }

    @Test
    void testSum2DArray() {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        assertEquals(10, Main.sum2DArray(matrix));
    }

    @Test
    void testIsSquareMatrixTrue() {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        assertTrue(Main.isSquareMatrix(matrix));
    }

    @Test
    void testIsSquareMatrixFalse() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertFalse(Main.isSquareMatrix(matrix));
    }

    @Test
    void testCreatePatternArray() {
        int[][] expected = {
                {0, 1, 0},
                {1, 0, 1}
        };
        assertArrayEquals(expected, Main.createPatternArray(2, 3));
    }
}
