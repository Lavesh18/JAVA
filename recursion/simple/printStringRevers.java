package recursion;

public class printStringRevers {
    public static void printReverse(String ex , int idx)
    {
        if(idx == 0){
            System.out.println(ex.charAt(idx));
            return ;
        }
        System.out.print(ex.charAt(idx)+ " ");
        printReverse(ex, idx-1);
       
    }
    public static void main(String[] args) {
        String ex = "Lavesh";

        //timecomplexity  = O(n)
        int idx = ex.length()-1;
        printReverse(ex,idx);

    }
}
