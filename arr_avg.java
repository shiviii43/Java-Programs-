package Learn;

public class arr_avg {
    public static void main(String [] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum +=arr[i];
        }
        System.out.println("The Average of the elements in array is : "+(sum/arr.length));
    }
}
