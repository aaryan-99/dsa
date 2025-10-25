import java.util.Scanner;

public class array_reversal {
    static void pname (int[] arr,int index){
            if(index<0){
            return ;
        }
        System.out.print(arr[index]+" ");
        pname(arr,index-1);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr =new int [5];
        int n =arr.length-1;
        for(int i=0 ; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        pname(arr,n);

        }

}

