package recursion;

public class moveAllXtoEnd {
    public static void moveAllEle(String str, int idx, int count, String newString, char ele) {
        // base case
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += ele;
            }
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(idx);
        if (curr == ele) {
            count++;
            moveAllEle(str, idx + 1, count, newString, ele);
        } else {
            newString += curr;
            moveAllEle(str, idx + 1, count, newString, ele);
        }
    }

    public static void main(String[] args) {
        // we eill start the idx from 0 to str.length-1
        // we will take count for x and newString that will be "" empty
        //Time complexity O(n)

        String str = "axbdchdxxxuixu";
        moveAllEle(str, 0, 0, "", 'x');
    }
}
