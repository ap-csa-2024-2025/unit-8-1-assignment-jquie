import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[][] arrInt = {{8,7,5,8},{1,3,9,5},{3,4,6,2}};
    System.out.println(sumOfDiag(arrInt));

    int rows = 6;
    int cols = 5;
    int[][] table = productTable(rows, cols);
    for (int i = 0; i < rows; i++) 
    {
      for (int j = 0; j < cols; j++) 
      {
        System.out.print(table[i][j]);
        System.out.print("  ");
      }
    System.out.println();
    System.out.println("----------------");
    }
  }

  public static int sumOfDiag(int[][] matrix)
  {
    int sum = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        if(row == col)
        sum += matrix[row][col];
      }
    }
    
    return sum;
  }

  public static int[][] productTable(final int numRows, final int numCols)
  {
    int[][] table = new int[numRows][numCols];
    for (int i = 0; i < numRows; i++)
    {
      for (int j = 0; j < numCols; j++) 
        {
          table[i][j] = i * j;
        }
    }
    return table;
  }

}
