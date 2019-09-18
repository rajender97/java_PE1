import java.util.Scanner;
public class program2 {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();
        int n = num;
        if (n > 20 && n < 30) {
            if (n % 2 == 0) {
                System.out.println("jerry");
            } else {
                System.out.println("Tom");
            }
        } else {
            System.out.println("the entered number not in between 20 and 30");
        }
    }
}
