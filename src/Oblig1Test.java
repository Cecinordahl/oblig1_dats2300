import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Oblig1Test {
    private final int[] ASCENDING_ARRAY = {3, 3, 4, 5, 5, 6, 7, 7, 7, 8};

    private final int[] NOT_ASCENDING_ARRAY = {3, 7, 4, 5, 5, 6, 7, 7, 7, 8};

    @Test
    void maks() {
        // Setup
        int expectedResult = 8;

        // Perform
        int actualResult = Oblig1.maks(ASCENDING_ARRAY);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void antallUlikeSortert() {
        // Setup
        int expectedResult = 6;

        // Perform
        int actualResult = Oblig1.antallUlikeSortert(ASCENDING_ARRAY);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void antallUlikeSortertThrowException() {
        // Setup
        String expectedMessage = "This array is not in ascending order";

        // Perform
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            Oblig1.antallUlikeSortert(NOT_ASCENDING_ARRAY);
        });
        String actualMessage = exception.getMessage();

        // Assert
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void antallUlikeUsortert() {
        // Setup
        int expectedResult = 6;

        // Perform
        int actualResult = Oblig1.antallUlikeUsortert(NOT_ASCENDING_ARRAY);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Disabled
    @Test
    void delsortering() {
        // Setup
        int[] array = {6, 10, 9, 4, 1, 3, 8, 5, 2, 7};
        int[] expectedArray = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        // Perform
        Oblig1.delsortering(array);

        // Assert
        assertArrayEquals(expectedArray, array);
    }
}