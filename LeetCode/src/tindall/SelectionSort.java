package tindall;

/*
SELECTION SORT
Complexity: O(n^2)
not suitable for large arrays

 */
public class SelectionSort {
    public static int[] runSelection(int[] array) {
        //1. iterate through array
        for(int i = 0; i < array.length-1;i++) {
            int min = i;
            //2. iterate through unsorted section
            for(int j = i+1; j < array.length; j++) {
                //3. if j < minimum, update min
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            //if min has changed, swap values
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }
}
