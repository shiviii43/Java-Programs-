package Learn;

public class arr_2D_add {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2,3},{4,5,6}};
        int[][] mat2 = {{1,2,3},{4,5,6}};
        int[][] res = {{0,0,0},{0,0,0}};

        for(int i=0;i<mat1.length;i++)          //for Row
        {
            for(int j=0;j<mat1[i].length;j++)       //for Columns in that row 
            {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("The Addition of two matrices is :");
        for(int a=0;a<res.length;a++)           //for Row
        {
            for(int b=0;b<res[a].length;b++)        //for Columns in that Row 
            {
                System.out.println(res[a][b]);
            }
        }
    }
}
