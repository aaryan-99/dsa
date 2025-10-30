public class quick_sort {
    static int partitionindex(int[]arr, int low, int high){
        int pivot = arr[0];
        for(int i = 0; i<high-1; i++){
            for(int j = i+1; j<high; j++){
            if(pivot>=arr[j]){
                int temp = arr[j];
                arr[j]=pivot;
                pivot=temp;
            }}
        }
        int pivotindex=0;
        for(int i = 0; i<high; i++){
            if(arr[i]==pivot){
                 pivotindex=i;
            }
        }
        return pivotindex;
    }

        // Function to perform quicksort
      static void quickSort(int[] arr, int low, int high) {
            // Base case
            if (low < high) {
                // Find pivot index
                int pivotIndex = partitionindex(arr, low, high);

                // Sort left subarray
                quickSort(arr, low, pivotIndex - 1);

                // Sort right subarray
                quickSort(arr, pivotIndex + 1, high);
            }
        }

    public static void main(String[] args) {
        int [] arr = {13,4,20,45,28,1,2,9};
        quickSort(arr,0, arr.length-1);
        System.out.println("array is:");
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}
