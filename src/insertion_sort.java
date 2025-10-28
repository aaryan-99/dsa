public class insertion_sort {
    static void insertionSort(int[]arr,int n){
        for(int i=0; i<n; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;}
            }
        }
        System.out.println("sorted array is :");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr= {13,46,24,52,20,9};
        insertionSort(arr, arr.length);
    }
}
