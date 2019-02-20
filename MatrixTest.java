//Your name here
import java.util.*;

public class MatrixTest
{
    //Allocate space for, fill, and return a two dimensional array of 
    //integers having the specified number of rows and columns.
    //Precondition:  rows and columns are positive.
    public static int[][] getUserMatrix(int rows, int columns)
    {
        int[][] matrix = new int[rows][columns];

        Scanner userInput = new Scanner(System.in);

        for(int row = 0; row < rows; row++)
            for(int col = 0; col < columns; col++)
            {
                System.out.print("Enter an integer for row " + (row + 1) 
                                               + ", column " + (col + 1) 
                                               + ". ==> ");

                matrix[row][col] = userInput.nextInt();  
            }

        return matrix;
    }

    //Return a new matrix that is the sum of the input matrices.
    //Precondition:  both input matrices are non-null and have the same
    //dimensions.
    public static int[][] calculateSum(int[][] matrix1, int[][] matrix2)
    {
        if(matrix1.length == 0)
            return new int[0][0];

        int[][] sum = new int[matrix1.length][matrix1[0].length];

        for(int row = 0; row < sum.length; row++)
            for(int col = 0; col < sum[0].length; col++)
                sum[row][col] = matrix1[row][col] + matrix2[row][col];

        return sum;
    }

    //Return a new matrix that is the product of the input matrices.
    //Precondition:  both input matrices are non-null and non-empty.
    public static int[][] calculateProduct(int[][] matrix1, int[][] matrix2)
    {
        int[][] result = new int[matrix1.length][matrix2[0].length];

        for(int row = 0; row < result.length; row ++)
            for(int col = 0; col < result[0].length; col++)
                for(int entry = 0; entry < matrix2.length; entry++)
                    result[row][col] += matrix1[row][entry] = matrix2[entry][col];
        
        return result;
    }
    
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        //Prompt user for dimensions of the first matrix. 
        System.out.print("How many rows in the first matrix? ");
        int rows = userInput.nextInt();
        
        System.out.print("How many columns in the first matrix? ");
        int columns = userInput.nextInt();
        
        //Call the method to fill the first matrix.
        int[][] matrix1 = getUserMatrix(rows, columns);

        //Prompt user for dimensions of the second matrix. 
        System.out.print("How many rows in the second matrix? ");
        rows = userInput.nextInt();
        
        System.out.print("How many columns in the second matrix? ");
        columns = userInput.nextInt();
        
        //Call the method to fill the second matrix.
        int[][] matrix2 = getUserMatrix(rows, columns);

        int[][] product = calculateProduct(matrix1, matrix2);
        
        //Output product to screen to check correctness.
        for(int i = 0; i < product.length; i++)
        {
            for(int j = 0; j < product[0].length; j++)
                System.out.print(product[i][j] + "  ");
        
            System.out.println();
        }
    }
}
