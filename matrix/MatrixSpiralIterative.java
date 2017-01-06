class MatrixSpiralIterative
{

  publis static void printSprial(int[][] inputMatrix)
  {
      int rowCount=0;
      int rowLength=inputMatrix.length()-1;
      int columnCount=0;
      int columnLength=inputMatrix[0].length()-1;

      while(rowCount<=rowLength && columnCount<=columnLength)
      {

        for(int p=columnCount;p<=columnLength;p++)
        {
          System.out.print(" "+inputMatrix[rowCount][p]);
        }

        for(int q=rowcount+1;q<=rowLength;q++)
        {
          System.out.print(" "+inputMatrix[q][columnLength]);
        }

        for(int r=columnLength-1;r>=columnCount;r--)
        {
          System.out.print(" "+inputMatrix[rowLength][r]);
        }

        for(int s=rowLength-1;s>columnCount;s-- )
        {
            System.out.print(" "+inputMatrix[s][columnCount]);
        }
        rowCount++;
        columnCount++;
        rowLength--;
        columnLength--;

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
      }

      MatrixSpiralIterative.printSprial(inputMatrix);
  }
}
