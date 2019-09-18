
import java.util.Scanner;
public class problem1 {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();
        int n = num,temp,sum=0;
        temp = n;
        int r,x;
        while (n>0){
            r = n%10;
            sum = (sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("entered number is palindrome");

        }
        else{
            System.out.println("entered number is not palindrome");
        }
        if(temp==sum) {
            int sum1 = 0;
            while(temp>0) {
                x = temp % 10;
                if (x % 2 == 0) {
                    sum1 = sum1 + x;
                }
                temp = temp / 10;
            }

            if(sum1>25){
                System.out.println("the even number sum is greater than 25");
            }
        }
    }

}



