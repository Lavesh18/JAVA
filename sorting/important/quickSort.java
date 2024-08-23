package sorting.important;

public class quickSort {
    public static int partition(int arr[],int low,int high)
    {
        int pivot = arr[high];
        int i=low-1;

        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //now take pivot on the correct pos so for that move i and make one more empty space for pivt 
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;  //pidx;

    }
    public static void quickS(int arr[],int low,int high)
    {
        if(low<high)
        {
            //as we know in one loop we will get correct pos of pivot so 
            int pidx = partition(arr,low,high);

            //now before pidx unsorted and after alos
            quickS(arr, low, pidx-1);

            quickS(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        //in quick sort we have pivot & partition
        //make pivit as alst elem of the array 
        // now smaller than pivot goes to left of pivot and large goes to right 
        //now recursive calls
        //take twor varialble low stores starting idx of array & high at the end of arrray
        int arr[] = {6,3,9,5,2,8};
        int n=arr.length;

        quickS(arr, 0, n-1);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
