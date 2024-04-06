package Learn;
import java.util.Scanner;
public class string_lexico{
    @SuppressWarnings("resource")
    public static void main(String[] args){

        //Lexicography basically means the order in which a string will be stored in a dictionary.
        // Example the word "app" will be greater then the word "ape".

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String : ");
        String s2 = sc.nextLine();
        System.out.println("The Strings are : ");
        System.out.println(s1);
        System.out.println(s2);
        int result = s1.compareTo(s2);
        if(result<0){
            System.out.println(s2+" is greater than "+s1);
        }
        else if(result==0){
            System.out.println(s1+" and "+s2+" are 2 equal strings.");
        }
        else{
            System.out.println(s1+" is greater than "+s2);
        }

    }
}