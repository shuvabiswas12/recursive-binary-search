package recursive_binary_search;

public class RecursiveBinarySearch {

    public static boolean recursiveBinSearch(int[] q, int itemToBeFound, int start, int end) {
        boolean isFound = false;
        int mid = (start + end) / 2;
        if (itemToBeFound == q[mid]) {
            System.out.println("Item found at index = " + mid);
            isFound = true;
            return isFound;
        }
        else if (start == mid) {
            isFound = false;
            return isFound;
        }
        else if (q[mid] < itemToBeFound) {
            isFound = recursiveBinSearch(q, itemToBeFound, mid + 1, end);
        }
        else {
            isFound = recursiveBinSearch(q, itemToBeFound, start, mid);
        }
        return isFound;
    }

    public static void main(String[] args) {
        int[] q = {1, 2, 3, 4, 9, 10};
        boolean isFound = recursiveBinSearch(q, 1, 0, q.length - 1);
        if (!isFound) {
            System.out.println("Not Found\n");
        }
    }
}
