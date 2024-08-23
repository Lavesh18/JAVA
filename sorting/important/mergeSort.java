package sorting.important;

public class mergeSort {
    public static void conquer(int arr[],int si,int mid,int ei)
    {
        int merger[] = new int[ei-si+1];

        int idx1 = si;
        int idx2 = mid+1;

        int x = 0;
        while(idx1<=mid && idx2<=ei)
        {
            if(arr[idx1]<=arr[idx2]) //if 2nd part have big value then
            {
                merger[x++] = arr[idx1++];
            }
            else
            {
                merger[x++] = arr[idx2++];
            }
        }
        // now if we traversed the array so suppose if element left in any arrar copy as it is cause they are already sorted

        while(idx1<=mid)
        {
            merger[x++] = arr[idx1++];
        }
        while(idx2<=ei)
        {
            merger[x++] = arr[idx2++];
        }

        // now replace merger with arr

        for(int i=0,j=si;i<merger.length;i++,j++)
        {
            arr[j] = merger[i];
        }
    }
    public static void divide(int arr[],int si,int ei)
    {
        if(si>=ei) //base case eaither we traversed whole array or we have only 1 elem left
        {
            return;
        }
        int mid = si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);

        conquer(arr,si,mid,ei);//now conquer
    }
    public static void main(String[] args) {
        //based on divide and conquer
        //divide uisng mid and then go upto where they have only 1 elem so it will be easy to sort

        //uisng two pointers starting index , ending and each part will be like 1st si to mid and 2nd mid+1 to ei like thsi 

        //Time complexity n(logn)
        int arr[] = {6,0,3,2,8};
        int n = 5;

        divide(arr, 0, n-1);

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
