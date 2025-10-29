import java.util.ArrayList;
public class Merge_Sort {
     static void merge(int[] arr, int low, int mid, int high) {
        // Create temp array
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        // Merge both sorted parts
        while(left <= mid && right <= high){  //This line keeps a check whether left half or right half runs out of elements
            if (arr[left] <= arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }

        // Add remaining left elements
        while (left <= mid)
            temp.add(arr[left++]);

        // Add remaining right elements
        while (right <= high)
            temp.add(arr[right++]);

        // Copy back to original array
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    }
    static void mergeSort(int[]arr, int low, int high){
         if(low>=high)
             return;
         int mid = (low+high)/2;
         // Sort left array...
        mergeSort(arr,low,mid);
        // Sort right array...
        mergeSort(arr,mid+1,high);

        merge(arr,low,mid,high);
    }

    public static void main(String[] args) {
        int[] arr = {13,46,52,9,2,5,99};
        mergeSort(arr,0,6);
        for(int a: arr){
        System.out.print(a+" ");
    }
}}