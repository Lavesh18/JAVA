package recursion.advanced;

import java.util.ArrayList;

public class subsetOfFirstNatural {
    public static void printSubset(ArrayList<Integer>subset)
{
    for(int i=0;i<subset.size();i++)
    {
        System.out.print(subset.get(i)+" ");
    }
    System.out.println();
}
    public static void findSubsets(int n ,ArrayList<Integer>subsets)
    {
        if(n==0)
        {
           printSubset(subsets);;
            return;
        }
        //if accept to add
        subsets.add(n);
        findSubsets(n-1, subsets);

        //now we have already added the subset so we have to delete 
        subsets.remove(subsets.size()-1);
        //if not add
        findSubsets(n-1, subsets);
    }
    public static void main(String[] args) {
        int n =3;

        ArrayList<Integer> subsets = new ArrayList<>();

        findSubsets(n, subsets);
    }
}
