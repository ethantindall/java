package tindall;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] testArray = {45,43,67,98,45,123,654,234,2443,43,12,23,56,57,58};
        System.out.println("Unsorted: " + Arrays.toString(testArray));


        //Bubble Sort
        //int[] bubbleSorted = BubbleSort.runBubble(testArray);
        //System.out.println("Bubble Sorted: " + Arrays.toString(bubbleSorted));

        //insertion sort
        //int[] insertionSorted = InsertionSort.runInsertion(testArray);
        //System.out.println("Insertion Sorted: " + Arrays.toString(insertionSorted));

        //merge sort
        //int[] mergeSorted = MergeSort.runMerge(testArray);
        //System.out.println("Merge Sorted: " + Arrays.toString(mergeSorted));

        //quicksort
        //int[] quickSorted = QuickSort.runQuick(testArray);
        //System.out.println("Quick Sorted: " + Arrays.toString(quickSorted));

        //selection sort
        //int[] selectionSorted = SelectionSort.runSelection(testArray);
        //System.out.println("Selection Sorted: " + Arrays.toString(selectionSorted));

        //shell sort
        int[] shellSorted = ShellSort.runShell(testArray);
        System.out.println("Shell Sorted: " + Arrays.toString(shellSorted));


        //binary search
        //System.out.println("Binary Search: " + BinarySearch.binarySearch(selectionSorted, 2443));
    }
}
