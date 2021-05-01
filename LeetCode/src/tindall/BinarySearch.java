package tindall;

public class BinarySearch {
    public static boolean runBinarySearch(int[] array, int x, int left, int right) {
        if(left > right) {
            return false;
        }
        int mid = left + (right-left) / 2;
        if (array[mid] == x) { return true;}
        else if (x  < array[mid]) {
            return runBinarySearch(array, x, left, mid-1);
        } else {
            return runBinarySearch(array, x, mid+1, right);
        }
    }
    public static boolean binarySearch(int[] a, int x) {
        return runBinarySearch(a, x, 0, a.length-1);
    }
}
