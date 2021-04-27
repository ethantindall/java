package tindall;

/*
Time: n log n
Space: n
 */

public class MergeSort {
    public static int[] runMerge(int[] unsortedArray) {
        runMerge(unsortedArray, new int[unsortedArray.length], 0, unsortedArray.length-1);
        return unsortedArray;
    }

    /**
     *
     * @param unsortedArray - old array
     * @param temp - one you copy everything to
     * @param leftStart - start index
     * @param rightEnd - end index
     */
    public static void runMerge (int[] unsortedArray, int[] temp, int leftStart, int rightEnd) {
        if(leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        //merge left half of the given array
        runMerge(unsortedArray, temp, leftStart, middle);
        //merge right half of given array
        runMerge(unsortedArray, temp, middle+1, rightEnd);
        //combine the two halves together
        mergeHalves(unsortedArray, temp, leftStart, rightEnd);
    }

    public static void mergeHalves(int[] unsortedArray, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) /2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (unsortedArray[left] <= unsortedArray[right]) {
                temp[index] = unsortedArray[left];
                left++;
            } else {
                    temp[index] = unsortedArray[right];
                    right++;
                }
            index++;
            }
        System.arraycopy(unsortedArray, left, temp, index,leftEnd-left+1);
        System.arraycopy(unsortedArray, right, temp, index,rightEnd-right+1);
        System.arraycopy(temp, leftStart, unsortedArray, leftStart, size);
    }
}
