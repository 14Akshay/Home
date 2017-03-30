package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue
{

private Queue<Integer> queue = new LinkedList<Integer>();

  public void push(int x)
  {
    queue.add(x);
    int size = queue.size();
    while(size>1)
    {
      queue.add(queue.remove());
      size--;
    }
  }

  public void pop()
  {
    System.out.println(queue.poll());
  }
  public static void main(String args[])
  {
    StackUsingOneQueue driver = new StackUsingOneQueue();
    driver.push(1);
    driver.push(2);
    driver.pop();
    driver.push(3);
    driver.push(4);
    driver.pop();
    driver.push(5);
    driver.push(6);
    driver.pop();
    driver.push(7);
    driver.push(8);
    driver.pop();

  }
}
