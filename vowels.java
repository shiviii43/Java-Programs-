package Learn;
import java.util.Scanner;
public class vowels {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.print("Enter a String : ");
        s = sc.nextLine();
        s = s.toLowerCase();
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                count++;
            }
        }
        System.out.println("The count of vowels in the entered String is "+count);

    }
}