public class Selection_Sort {
    static void selection_sort(int[]arr,int n){
        for(int i = 0; i<n-1; i++){   // i goes from 0 to 4....
            int min = i ;
            for(int j = i+1; j<n; j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min]= temp;
        }
        System.out.print("Sorted array is :");
        for(int x : arr){
            System.out.print(x+" ");}
    }
    public static void main(String[] args) {
        int[] arr = {56,42,21,1,2,76,4};
        selection_sort(arr,arr.length);
    }
}
