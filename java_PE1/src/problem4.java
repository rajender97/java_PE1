import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt();
        int i, j;

        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }

        }
    }
}