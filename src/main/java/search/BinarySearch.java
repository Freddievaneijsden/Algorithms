package search;

public class BinarySearch {

    public static int binarySearch (int[] list , int target) {
        int lowIndex = 0;
        int highIndex = list.length - 1;
        int midIndex = lowIndex + highIndex/2;
        if (target == list[midIndex]) {
            System.out.println("Number " + target + " found at index: " + midIndex);
            return target;
        }
        else if (target < list[midIndex]) {
            highIndex = midIndex - 1;
            midIndex = (lowIndex + highIndex)/2;
            System.out.println(lowIndex);
            System.out.println(midIndex);
            System.out.println(highIndex);
            if (target == list[midIndex]) {
                System.out.println("Number " + target + " found at index: " + midIndex);
                return target;
            }
        }
        else if (target > list[midIndex]) {
            lowIndex = midIndex+ 1;
            midIndex= (lowIndex + highIndex)/2;
            System.out.println(lowIndex);
            System.out.println(midIndex);
            System.out.println(highIndex);
            if (target == list[midIndex]) {
                System.out.println("Number " + target + " found at index: " + midIndex);
                return target;
            }
        }
        return -1;
    }


}
