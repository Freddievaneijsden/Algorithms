package search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class BinarySearchTest {

    int [] testArray = {1, 2, 3, 4, 5, 6, 7};

    @Test
    void binarySearchReturnNegativeOne() {
        int expectedValue = BinarySearch.binarySearch(testArray, 3);
        assertThat(expectedValue).isEqualTo(-1);
    }

    @Test
    void binarySearchShouldReturnIndexWhenGivenNumber6() {
        assertThat(BinarySearch.binarySearch(testArray, 6)).isEqualTo(5);

    }
}