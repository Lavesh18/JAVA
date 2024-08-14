package sorting;

public class insertionSort {
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        //section wise sorting 
        //we will put 1st element in sorted and then in unsorted we will pick 1 by 1 and put in sorted in sorted manner 
        int arr[] = {7,2,1,8,1};
        for(int i=1;i<arr.length;i++)
        {
            int curr = arr[i];
            int j=i-1;

            while(j>=0 && curr < arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = curr;
        }
        printArray(arr);
    }
}
