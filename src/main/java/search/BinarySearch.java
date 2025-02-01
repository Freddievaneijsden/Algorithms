package search;

public class BinarySearch {

    public static int binarySearch(int[] list, int target) {
        int lowIndex = 0;
        int highIndex = list.length - 1;
        int midIndex = lowIndex + highIndex / 2;
        if (target == list[midIndex]) {
            printWhenTargetIsFound(target, midIndex);
            return midIndex;
        }
        while (target != list[midIndex]) {
            if (target < list[midIndex]) {
                highIndex = midIndex - 1;
                midIndex = (lowIndex + highIndex) / 2;
                if (target == list[midIndex]) {
                    printWhenTargetIsFound(target, midIndex);
                    return midIndex;
                }
                else if (midIndex == lowIndex) {
                    break;
                }
            } else if (target > list[midIndex]) {
                lowIndex = midIndex + 1;
                midIndex = (lowIndex + highIndex) / 2;
                if (target == list[midIndex]) {
                    printWhenTargetIsFound(target, midIndex);
                    return midIndex;
                }
                else if (midIndex == highIndex) {
                    break;
                }
            }
        }
        return -1;
    }

    private static void printIndexPositions(int lowIndex, int midIndex, int highIndex) {
        System.out.println(lowIndex);
        System.out.println(midIndex);
        System.out.println(highIndex);
    }

    public static void printWhenTargetIsFound(int target, int midIndex) {
        System.out.println("Number " + target + " found at index: " + midIndex);
    }
}


