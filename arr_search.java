package Learn;
import java.util.Scanner;
public class arr_search {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int[] arr = {12,45,62,32,47,46,95,36,19,29,9,18,13,7,76};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search :");
        int ele = sc.nextInt();
        int i,count=0;
        //Checking using for loop
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==ele)
            {
                count=1;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("The Entered Element was not found in the array.");
        }
        else
        {
            System.out.println("The Entered element was found at location : "+(i+1));
        }
    }
}
