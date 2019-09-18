
import java.util.*;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        String[] num = s.split(" ");
        int length=num.length;
        int sum=0;
        for(int i=0;i<length;i++)
        {
            sum=sum+Integer.parseInt(num[i]);
        }
        System.out.print(sum);
    }
}
