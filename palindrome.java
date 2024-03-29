package Learn;
import java.util.Scanner;
public class palindrome {
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        System.out.print("Enter a number to check : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n;
        int rem=0,rev=0;
        //reversing a number 
        while(n>0)
        {
            rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        System.out.println(rev);
        if(rev==org)
        {
            System.out.println("The number is a Palindrome.");
        }
        else{
            System.out.println("The entered number is not a Palindrome.");
        }
    }
}
