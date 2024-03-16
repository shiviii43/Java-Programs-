//This is a Program to calculate percentage of a Student based on the marks inputted by the user.
package Learn;
import java.util.Scanner;


public class CBSE_per_cal {
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("TO CALCULATE THE PERCENTAGE PLEASE ENTER THE MARKS OF THE STUDENT ");
        System.out.println("Enter the marks of ENGLISH EXAM :");
        int eng = sc.nextInt();
        System.out.println("Enter the marks of MATHS EXAM :");
        int maths = sc.nextInt();
        System.out.println("Enter the marks of HINDI Exam :");
        int hindi = sc.nextInt();
        System.out.println("Enter the marks of SCIENCE EXAM :");
        int sci = sc.nextInt();
        System.out.println("Enter the marks of SOCIAL STUDIES EXAM :");
        int sst = sc.nextInt();
        float per = (eng+maths+hindi+sci+sst)/5;
        System.out.println("THE PERCENTAGE OF STUDENT ACCORDING TO THE ENTERED MARKS IS "+per);
    }
}
