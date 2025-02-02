package sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    int[] unsortedArray = {24, 7, 30 , 18, 15, 16, 22, 1};

    @Test
    void BubbleSortReturnUnsortedArrayInAscendingOrder() {
        int[] expectedResult = {1, 7, 15, 16, 18, 22, 24, 30};

        assertThat(BubbleSort.bubbleSort(unsortedArray)).isEqualTo(expectedResult);
    }

}