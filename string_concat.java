package Learn;
import java.util.Scanner;
public class string_concat {
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First String : ");
        String s1,s2 = new String();
        s1 = sc.nextLine();
        System.out.print("Enter the Second String :");
        s2 = sc.nextLine();
        System.out.println("The Strings after Concatination are : ");
        s1 = s1.concat(s2);
        System.out.print(s1);
    }
}
