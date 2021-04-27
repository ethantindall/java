package tindall;

/*
BUBBLE SORT
Complexity: O(n^2)
not suitable for large arrays


* 1. Iterate through array
* 2. If i > i+1, swap
* 3. Continue n times, unless you find the array is sorted
* */

public class BubbleSort {
    public static int[] runBubble(int[] unsortedArray) {
        //1. Iterate through array
        for (int i = 0; i < unsortedArray.length; i++) {
            //3. Continue n times, unless array is sorted
            for (int j = 0; j < unsortedArray.length - i - 1; j++) {
                //2. If i > i+1, swap
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }
        return unsortedArray;
    }
}

