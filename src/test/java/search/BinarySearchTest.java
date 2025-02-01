package search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class BinarySearchTest {

    int [] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    void binarySearchReturnNegativeOneWhenTargetIsAbsent() {
        assertThat(BinarySearch.binarySearch(testArray, 100)).isEqualTo(-1);
    }

    @Test
    void binarySearchShouldReturnIndexWhenTargetIsFound() {
        assertThat(BinarySearch.binarySearch(testArray, 10)).isEqualTo(9);
    }
}