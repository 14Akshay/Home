/*Mancunian is a fan of the special properties of numbers and adores all things numerical.

His latest fascination are the so-called "zeroless" Pandigital Numbers. But he has imposed an additional restriction that each digit (from 1-9) should occur atmost once in the number. Such zeroless pandigital numbers are called almighty pandigital numbers. To sum up, an almighty pandigital number is an integer (let its number of digits be d) such that it contains the digits from 1 to d exactly once. For example, 102 is a pandigital number but not zeroless. 231445 is a zeroless pandigital number but not almighty. 35124 is an almighty pandigital number.
Given Q queries, each of the type L R, he asks you to find the number of almighty pandigital numbers in the range from L to R (inclusive).

Input:
The first line contains Q denoting the number of queries. Each of the next Q lines is of the form L R denoting a specific query.

Output:
For each query, output the answer to the given query in a new line.

Constraints:
1 <= Q <= 105
1 <= L, R <= 106

Sample input
3
1 30
4 11
220 1235

output
3
0
4


*/
import java.util.Scanner;


class Pandigital {

	public static int isAlmighty(int number)
	{
		int length = String.valueOf(number).length();
		int[] frequencyArray = new int[10];
		int reminder= number %10;
		while(number!=0){
			if((reminder<=length  && frequencyArray[reminder]==0))
			{
				if(reminder==0)
				{
					return 0;
				}
				frequencyArray[reminder]=frequencyArray[reminder]+1;
				number= number/10;
				reminder = number %10;
			}
			else
				return 0;	
		}
		return 1;
	}
	public static void main(String args[] ) throws Exception {

		Scanner s = new Scanner(System.in);
		int[] outputForAllNumbers = new int[1000001];
		for(int i =1 ;i<1000001;i++)
		{
			outputForAllNumbers[i] = outputForAllNumbers[i-1] + isAlmighty(i);
		}
		int N = s.nextInt();
		for(int i=0;i<N;i++)
		{
			int z = s.nextInt();
			int  y = s.nextInt();
			System.out.println(outputForAllNumbers[y]-outputForAllNumbers[z-1]);

		}
	}
}
