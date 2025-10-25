import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int x = input.nextInt();
            int sum = 0;
            while(x!=0) {
                int remainder = x % 10;
                x = x / 10;
                if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE/10 && remainder > 7)) {
                    System.out.println("0");
                    return;
                }
                if(sum < Integer.MIN_VALUE/10||(sum== Integer.MIN_VALUE/10 && remainder<-8)){
                    System.out.println("0");
                    return;
                }
                sum=sum*10+remainder;
            }
        System.out.println(sum);
        }
    }



