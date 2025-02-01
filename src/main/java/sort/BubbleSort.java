package sort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] unsortedArray) {
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        for (int i = 0; i < sortedArray.length - 1; i++) {
            System.out.println("Outer : " + i);
            for (int j = 0; j < sortedArray.length - 1; j++) {
                if (sortedArray[j] > sortedArray[j+1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                    System.out.println("Inner :" + j);
                }
            }
        }
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(Arrays.toString(unsortedArray));
        return sortedArray;
    }
}
