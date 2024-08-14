package recursion.medium;

public class towerOfHanoi {

    public static void transwerDisk(int n , String src , String helper , String dest)
    {
        //base case
        if(n==1)
        {
            System.out.println("transwer disk " + n + " from "+ src +  " to "+dest);
            return;
        }
        transwerDisk(n-1, src, dest, helper);
        System.out.println("transwer disk " + n + " from "+ src +  " to "+dest);
        transwerDisk(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        //we will have 3 towers source , helper , dest
        //work is to put n disk from source to dest
        //number of steps to put all there in assending

        //suppose we have 3 disk then in that case we can acheive as source as helper and helper as source in the n=2 case


        //now how to get 3 and 2 in same order in helper as for this the dest will helper and helper as dest
        // 1) bring n-1 disk to helper
        //2) 1 disk from s=>d
        //3) now n-1 from helper to dest using source as helper

        //time complexity O(2^n)
        int n = 2;
        transwerDisk(n,"S" , "H" , "D");

    }
}
