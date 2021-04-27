package tindall;

import java.util.Arrays;


public class QuickSort {
    public static int[] runQuick(int[] unsortedArray) {
        quickSort(unsortedArray, 0, unsortedArray.length - 1);
        return unsortedArray;
    }

    public static void quickSort(int[] array, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        //1. Select pivot
        int pivot = array[(leftStart + rightEnd) / 2];

        //2. scan through list
        int index = partition(array, leftStart, rightEnd, pivot);
        //recursion
        quickSort(array, leftStart, index - 1);
        quickSort(array, index, rightEnd);

    }

    public static int partition(int[] array, int left, int right, int pivot) {
        //2. scan through list.
        while (left <= right) {
            // 2a. move everything smaller than pivot to left, bigger to right
            while(array[left] < pivot) {
                left++;
            }
            while(array[right] > pivot) {
                right--;
            }
            if (left <=right) {
                //Swap values
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                //move counters
                left++;
                right--;
            }

        }
        return left;
    }
}