import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[][] arrInt = {{8,7,5,8},{1,3,9,5},{3,4,6,2}};
    System.out.println(sumOfDiag(arrInt));
  }


  public static int sumOfDiag(int[][] matrix)
  {
    int sum = 0;
    for (int inner = 0; inner < matrix[0].length; inner++)
    {
      for (int outer = 0; outer < matrix.length; outer++)
      {
        sum += matrix[outer][inner];
      }
    }
    
    return sum;
  }

/*  public static int[][] productTable(final int numRows, final int numCols)
  {
    return null;
  }
  */
}
