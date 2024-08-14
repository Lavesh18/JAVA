package sorting;

public class selectionSort {

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        //no adjacent swapping 1 iteration 1 swap find small and then swap
        //selecetion sort

        //time complexity O(n^2)
        int arr[] = {7,3,1,8,2};
        for(int i=0;i<arr.length-1;i++)
        {
            int sm = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[sm]>arr[j])
                {
                    sm=j;
                }


            }
            //swap the number
            arr[sm] = arr[sm] ^ arr[i];
            arr[i] = arr[sm] ^ arr[i];
            arr[sm] = arr[sm] ^ arr[i];
        }
        printArray(arr);
    }
}
