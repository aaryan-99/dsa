public class pattern{
    public static void main(String[] args) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            for(int j=0; j<9-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*9-(2*i+1); k++){
                System.out.print("*");
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}



