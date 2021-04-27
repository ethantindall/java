package tindall;

/*
INSERTION SORT
Complexity: O{n^2)
 */
public class InsertionSort {
    public static int[] runInsertion(int[] unsortedArray) {
        insertionSort(unsortedArray);
        return unsortedArray;
    }

    public static void insertionSort(int[] unsortedArray) {
        //iterate through array
        for (int i = 1; i< unsortedArray.length; i++) {
            //temp variable
            int current = unsortedArray[i];
            int j = i - 1;
            //if j > current, shift all to right, and move to the left
            while (j >= 0 && unsortedArray[j] > current) {
                unsortedArray[j + 1] = unsortedArray[j];
                j--;
            }
            //place sorted element back into array
            unsortedArray[j + 1] = current;
        }
    }
}
