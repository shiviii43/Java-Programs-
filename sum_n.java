package Learn;
import java.util.Scanner;
public class sum_n{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number till where you want the sum from 0 : ");
        int n = sc.nextInt();
        int sum=0;
        //Sum of numbers till n
        while(n>0){
            sum = sum + n;
            n--;
        }
        System.out.println("The sum is : "+sum);
    }
}