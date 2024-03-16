package Learn;
import java.util.Scanner;
public class sum2 {
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number :");
        int a = sc.nextInt();
        System.out.println("Enter the Second number:");
        int b = sc.nextInt();
        System.out.println("The Sum is "+(a+b));
    }
}
