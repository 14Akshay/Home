/*
inplace solution by Akshay Siddhpura
complexity : O(nlogn)

test cases covered:
1) negative numbers
2) postive numbers
3) negative and postive numbers
*/


package array;
import java.util.*;
public class PairOfElementsForSum
{

    public void findPair(int[] input,int targetSum)
    {
        int arrayLength = input.length;
        Arrays.sort(input);
        int left = 0;
        int right = arrayLength-1;

        while(left<right){
        	
            if(input[left] + input[right] == targetSum){
              System.out.println("Pair is :: ("+input[left]+","+input[right]+")");
              left++;
              right--;
            }	
            else if(input[left] + input[right] > targetSum)
              right--;
            else
              left++;
        }

    }
    public static void main(String args[])
    {
        int[] x = {1,3,5,2,6,4};
        int[] y = {12,14,2,5,7,3};
        int[] z = {-2,-4,2,5,-7,3,-5};
        int[] w = {-2,4,2,5,7,3};
        int[] p = {-2,-4,-2,-5,-7,-3};
        PairOfElementsForSum op = new PairOfElementsForSum();
        	op.findPair(x,9);
	        //op.findPair(y,5);
	        //op.findPair(z,-2);
	        //op.findPair(w,2);
	        // op.findPair(p,-44); 

    }

}
