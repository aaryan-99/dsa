public class quick_sort {
    static int partition(int[] arr, int low, int high){
       int pivot = arr[low];
       int left = low + 1;
       int right = high;
       while(left<=right){
           while(left<=right && arr[left]<pivot) left++;
           while(left<=right && arr[right]>pivot) right--;
           if(left<right){
               int temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
           }}
           int temp = arr[right];
           arr[right] = arr[low];
           arr[low] = temp;
            return right;
    }
    static void Sort(int[] arr, int low, int high){
        if(low>=high) return;  // base case....
        int pivotIndex = partition(arr, low, high);
        // recursion...
       Sort(arr, low, pivotIndex-1);
       Sort(arr, pivotIndex+1, high);
    }



    public static void main(String[] args) {
        int[] arr = {13,4,20,45,28,1,2,9};
        Sort(arr, 0, 7);
        System.out.println("Array after sorting is:");
        for(int a: arr){
            System.out.print(a+" ");
    }
}}
