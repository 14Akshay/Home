
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianStreamIntegers {

	PriorityQueue<Integer> minQ = new PriorityQueue<Integer>();
	PriorityQueue<Integer> maxQ = new PriorityQueue<Integer>(20,Collections.reverseOrder());
	
	public void addNumber(int number)
	{
		maxQ.offer(number);
		minQ.offer(maxQ.poll());
		
		if(minQ.size()>maxQ.size())
			maxQ.offer(minQ.poll());
	}
	
	public double findMedian()
	{
		if(maxQ.size()==minQ.size())
			return ((double)maxQ.peek()+ (double)minQ.peek())/2;
		else
			return (double) maxQ.peek();		
	}
	
	public static void main(String[] args) {
		MedianStreamIntegers solution= new MedianStreamIntegers();
	        solution.addNumber(4);
	        System.out.println(solution.findMedian());
	        solution.addNumber(8);
	        System.out.println(solution.findMedian());
	        solution.addNumber(2);
	        System.out.println(solution.findMedian());
	        solution.addNumber(11);
	        System.out.println(solution.findMedian());
	        solution.addNumber(13);
	        System.out.println(solution.findMedian());
	        solution.addNumber(14);
	        
	        System.out.println(solution.findMedian());
	        solution.addNumber(-1);
	        System.out.println(solution.findMedian());
	}

}
