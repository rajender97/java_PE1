import java.util.*;

public class problem7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt();
        int d=num;
        String s = Integer.toString(d);
        int length=s.length();
        int i;
        int a[]=new int[length];
        int n=num;

            for(i=0;i<length;i++)
            {
                a[i]=n%10;
                n=n/10;
            }
            for(i=0;i<length;i++){
                System.out.print(a[i]);
            }
            Arrays.sort(a);
        System.out.println();
            for(i=length-1;i>=0;i--) {
                System.out.print(a[i]);
            }
        System.out.println();
         int sum=0;
            for(i=0;i<length;i++)
            {

                if(a[i]%2==0){
                    sum=sum+a[i];
                }
            }
        System.out.print(sum);
        System.out.println();
            if(sum>15){
                System.out.print("True");
            }
            else
            {
                System.out.print("False");
            }




    }
}
