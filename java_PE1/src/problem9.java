import java.util.*;
public class problem9 {
    public static void main(String[] args){
        String str ="";
         String revStr = "";

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string :");
        str= in.nextLine();


        int len= str.length();

        for ( int i = len- 1 ; i >= 0 ; i-- )
            revStr= revStr+ str.charAt(i);
        System.out.println("Reverse String is: "+revStr);
    }
}


