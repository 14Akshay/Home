import java.util.HashSet;
import java.util.Set;

public class TotalPalindromeSubString {

	public static void main(String args[])
	{
		String x = "abaa";
		int count =0;
		String  substringOriginal="",subStringReverse ="";
		Set  ss= new HashSet<Integer>();
		int length= x.length();
		String reverse = new StringBuilder(x).reverse().toString();


		for (int i = 0; i < x.length(); i++) {
			for (int j = i+1; j <= x.length(); j++) {
				substringOriginal= x.substring(i,j);
				ss.add(substringOriginal.hashCode());
				//System.out.println(substringOriginal);
			}


		}
		//System.out.println("---------------------s");

		for (int i = 0; i < x.length(); i++) {
			for (int j = i+1; j <= x.length(); j++) {
				subStringReverse= reverse.substring(i,j);
				//  System.out.println(subStringReverse);
				if(ss.contains(subStringReverse.hashCode()))
					count++;
			}


		}

		System.out.println(count);
	}

}
