package Learn;

public class Reverse_arr{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        //Printing the array in Reverse order 
        System.out.println("The Elements of the array are :");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}