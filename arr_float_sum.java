package Learn;

public class arr_float_sum {
    public static void main(String[] args) {
        //Create an array of 5 floats and calculate their sum.
        float[] arr = {82.1f,51.6f,89.0f,41.44f,64.64f};
        float sum = 0.0f;
        for(int i=0;i<arr.length;i++)
        {
             sum+= arr[i];
        }
        System.out.println("The sum of elements is "+sum);
    }
}
