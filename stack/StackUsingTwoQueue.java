package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue
{
private Queue<Integer> mainQueue= new LinkedList<Integer>();
private Queue<Integer> tempQueue= new LinkedList<Integer>();

  public void push(int x)
  {
    mainQueue.add(x);
  }

  public void pop()
  {
    if(mainQueue.size()<1)
      System.out.println("nothing to pop");

    while(mainQueue.size()>1)
    {
      tempQueue.add(mainQueue.poll());
    }
    System.out.println(mainQueue.poll());
    mainQueue=tempQueue;
    tempQueue = new LinkedList<Integer>();

  }
  public static void main(String args[])
  {
    StackUsingTwoQueue s = new StackUsingTwoQueue();
    s.push(2);
    s.push(3);

    s.push(4);
    s.pop();
    s.push(5);
    s.push(26);
    s.pop();
    s.push(27);
    s.pop();
    s.push(28);
  }

}
