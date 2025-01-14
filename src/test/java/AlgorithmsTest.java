import com.project.Algorithms;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmsTest {

    @Test
    void testFindSecondLargest() {
        // Null và mảng không hợp lệ
        assertNull(Algorithms.findSecondLargest(null), "Should return null for null input");
        assertNull(Algorithms.findSecondLargest(new int[]{}), "Should return null for empty array");
        assertNull(Algorithms.findSecondLargest(new int[]{1}), "Should return null for single-element array");

        // Mảng hợp lệ
        assertEquals(3, Algorithms.findSecondLargest(new int[]{5, 3, 2, 1}), "Second largest should be 3");
        assertNull(Algorithms.findSecondLargest(new int[]{2, 2, 2}), "Should return null for identical elements");
        assertEquals(5, Algorithms.findSecondLargest(new int[]{5, 7, 5, 4}), "Second largest should be 5");

        // Trường hợp biên (giá trị âm)
        assertEquals(-2, Algorithms.findSecondLargest(new int[]{-1, -2, -3}), "Second largest should be -2");

        // Trường hợp có giá trị Integer.MIN_VALUE
        assertEquals(-2, Algorithms.findSecondLargest(new int[]{-1, -2, Integer.MIN_VALUE}), "Second largest should be -2");
    }


    @Test
    void testIsPalindrome() {
        assertFalse(Algorithms.isPalindrome(null));
        assertTrue(Algorithms.isPalindrome(""));
        assertTrue(Algorithms.isPalindrome("a"));
        assertTrue(Algorithms.isPalindrome("radar"));
        assertFalse(Algorithms.isPalindrome("hello"));
        assertTrue(Algorithms.isPalindrome("level"));
    }

    @Test
    void testCountWordOccurrences() {
        assertThrows(IllegalArgumentException.class, () -> Algorithms.countWordOccurrences(null));
        assertEquals(Collections.emptyMap(), Algorithms.countWordOccurrences(Collections.emptyList()));
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> wordCount = Algorithms.countWordOccurrences(words);
        assertEquals(2, wordCount.get("apple"));
        assertEquals(1, wordCount.get("banana"));
        assertEquals(1, wordCount.get("orange"));
    }

    @Test
    void testCountUniqueElements() {
        assertEquals(0, Algorithms.countUniqueElements(null));
        assertEquals(0, Algorithms.countUniqueElements(Collections.emptyList()));
        assertEquals(3, Algorithms.countUniqueElements(Arrays.asList(1, 2, 2, 3)));
        assertEquals(1, Algorithms.countUniqueElements(Arrays.asList(5, 5, 5, 5)));
    }

    @Test
    void testFindMaxInMatrix() {
        assertThrows(IllegalArgumentException.class, () -> Algorithms.findMaxInMatrix(null));
        assertThrows(IllegalArgumentException.class, () -> Algorithms.findMaxInMatrix(new int[][]{}));
        assertThrows(IllegalArgumentException.class, () -> Algorithms.findMaxInMatrix(new int[][]{{}}));
        assertEquals(8, Algorithms.findMaxInMatrix(new int[][]{{1, 2}, {8, 3}}));
        assertEquals(10, Algorithms.findMaxInMatrix(new int[][]{{10}}));
    }
}

