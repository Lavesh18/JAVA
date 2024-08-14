package recursion;

public class checkArraySorted {
    public static Boolean checkSorted(int[] n, int idx) {
        if (idx == n.length - 1) { //base case
            return true;
        }
        if (n[idx] < n[idx + 1]) {
            return checkSorted(n, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1};
        //Timce Complexity O(n)
       System.out.println( checkSorted(arr, 0));
    }
}
