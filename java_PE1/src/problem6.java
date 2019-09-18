import java.util.*;

public class problem6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char");
        char c = sc.next().charAt(0);
        if(Character.isUpperCase(c)) {
            System.out.println(c+"-Capital letter");
        }
        else if(Character.isLowerCase(c))
        {
            System.out.println(c+"-small letter");
        }
        else if(Character.isDigit(c))
        {
            System.out.println(c+"-is digit");
        }
        else{
            System.out.println(c+"-Special symbol");
        }

    }
}
