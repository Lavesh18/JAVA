package recursion.simple;

public class printRange {

    public static void printNumb(int n) {
        if(n==0) //base case
        {
                return;
        }
        System.out.println(n + " ");  //print
        printNumb(n-1);  // recursion
    }

    public static void sortOrder(int n) {
    if(n==6)
    {    return;}
    System.out.println(n);
    sortOrder(n+1);
    }
    public static void main(String[] args) {
        //print from 5 to 1 
        int n = 5;
        int newN = 1;
        printNumb(n);
        //now print 1 to 5
        sortOrder(newN);

    }
}
