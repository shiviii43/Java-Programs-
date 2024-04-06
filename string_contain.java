package Learn;
import java.util.Scanner;
public class string_contain {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String : ");
        String s1,s2 = new String();
        s1 = sc.nextLine();
        System.out.println("Enter the value you want to check in the above inputted String.");
        s2 = sc.nextLine();
        boolean res = s1.contains(s2);
        System.out.println("Present : "+res);
    }
    
}
