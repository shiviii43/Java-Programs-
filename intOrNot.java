package Learn;

import java.util.Scanner;
public class intOrNot {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter an Integer : ");
        Scanner sc = new Scanner(System.in);
        boolean a = sc.hasNextInt();
        System.out.println("THE ENTERED NUMBER WAS AN INTEGER : "+a);
    }   
}
