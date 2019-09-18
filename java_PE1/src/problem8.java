import java.util.*;
public class problem8 {
    public static void checkTarget(int num, int target){
        Scanner scan = new Scanner(System.in);
        if(num==target)
        {
            System.out.print("Success ");
            return;
        }
        else if(num>target){
            System.out.print("Greater than target,enter another number ");
            int z=scan.nextInt();
            checkTarget(z,target);
        }
        else {
            System.out.print("Less than target,enter another number ");
            int z=scan.nextInt();
            checkTarget(z,target);
        }
    }
    public static void main(String[] args){
        int target=55;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number between 1 and 100: ");

        int num = scan.nextInt();
        checkTarget(num,target);


    }
}
