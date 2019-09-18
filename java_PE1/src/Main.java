import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        s = sc.nextLine();
        System.out.println("You entered String "+s);

        int length = s.length();
        System.out.println("the length of String is "+length);
        int i;
        for(i=0;i<length;i++)
        {
            if(s.charAt(i)>=48 && s.charAt(i)<=57) {
                System.out.println(s.charAt(i) + "-number");
            }

            else if(s.charAt(i)== 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                System.out.println(s.charAt(i)+ "-vowel");

            }
           else
            {
                System.out.println(s.charAt(i)+ "-consonant");
            }


        }

    }
}
