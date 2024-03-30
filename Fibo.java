package Learn;
import java.util.Scanner;
public class Fibo{
    public static void main(String[] args) {
    // 0 1 1 2 3 5
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements that you want in the Series : ");
    int n = sc.nextInt();
    int n3=0,n1=0,n2=1;
    System.out.print(n1+"\t");     //0
    System.out.print(n2+"\t");     //1
    while(n>2)
    {
        n3 = n1+n2;     //1     2      3        5
        n1 = n2;        //1,1,2
        n2 = n3;        //1,2,3
        System.out.print(n3+"\t");
        n--;
    }
    }
}