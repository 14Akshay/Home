
public class DiagonalTraversalMatrix
{

  public static void printDiagonal(int[][] inputMatrix)
  {
      int rowCount = inputMatrix.length-1;
      int columnCount = inputMatrix[0].length-1;


      //rowCount Diagonals
      for(int r=0;r<=rowCount;r++)
      {
        for(int row =r,col =0;row>=0 && col<=columnCount;col++,row--)
        {
          System.out.print(" "+inputMatrix[row][col]);
         // System.out.println("a");
        }
      }

      //columnCount Diagonals
      for(int c=1;c<=columnCount;c++)
      {
        for(int row =rowCount,col =c;row>0 && col<=columnCount;col++,row--)
        {
          System.out.print(" "+inputMatrix[row][col]);
        }
      }

  }
  public static void main(String args[])
  {
      int[][] inputMatrix = {
      {1,2,3,4,5},
      {6,7,8,9,10},
      {11,12,13,14,15},
      {16,17,18,19,20},
      {21,22,23,24,25}
      };
      DiagonalTraversalMatrix.printDiagonal(inputMatrix);

  }
}
