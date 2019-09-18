import java.util.*;
public class problem10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str= in.nextLine();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt();
        int length= str.length();
        String ss=str.substring(length-num);
        System.out.println(str+ss.repeat(num));
    }
}
