package sorting;

public class bubbleSort {

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        //runs n-1 time loop 
        //it places max element to last the 2nd last to 2nd last poistion
        //will check adjacent and move behind if heavy
        int arr[] = {7,8,3,1,2};
        int n = arr.length;
        //bubble sort
        //time complexity O(n^2)
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j] >arr[j+1])
                {
                    //swap  
                    // int temp = arr[i];
                    // arr[i] = arr[i+1];
                    // arr[i+1] = temp;

                    // we can use bits for less time complexity

                    arr[j] = arr[j] ^ arr[j+1];

                    arr[j+1] = arr[j] ^ arr[j+1];

                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
          
        }
        printArray(arr);
        
        
    }
}
