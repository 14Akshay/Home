package tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderTraversalBinaryTree {
	public static TreeMap<Integer, ArrayList<Integer>> ht = new TreeMap<>();
	public void verticalOrder(Node root)
	{
		if(root==null)
			return;
		Queue<QueuePack> Q = new LinkedList<>();
		Q.add(new QueuePack(root,0));
		while(!Q.isEmpty()){
			QueuePack current = Q.remove();
			Node<Comparable<?>> currNode = current.node;
			int currlevel = current.level;
			if(ht.containsKey(currlevel))
			{
				ArrayList<Integer> temp = ht.get(currlevel);
				temp.add((Integer) currNode.data);
				ht.put(currlevel, temp);
			}
			else{
				ArrayList<Integer> temp =new ArrayList<>();
				temp.add((Integer) currNode.data);
				ht.put(currlevel, temp);
			}
			if(currNode.left!=null)
				Q.add(new QueuePack(currNode.left,currlevel-1));
			if(currNode.right!=null)
				Q.add(new QueuePack(currNode.right,currlevel+1));
		}
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		VerticalOrderTraversalBinaryTree st = new VerticalOrderTraversalBinaryTree();
		int rootData = 1;
		//test case 1
		Node<Integer> root = bt.addNode("", null, rootData);
		Node<Integer> rootLeft=bt.addNode("left", root, 2);
		Node<Integer> rootRight=bt.addNode("right", root, 3);
		Node<Integer> rootLeftLeft=bt.addNode("left", rootLeft, 4);
		Node<Integer> rootLeftRight=bt.addNode("right", rootLeft, 5);
		Node<Integer> rootRightLeft=bt.addNode("left", rootRight, 6);
		Node<Integer> rootRightRight=bt.addNode("right", rootRight, 7);
		//test case 2
		/*Node<Integer> root = bt.addNode("", null, rootData);
		Node<Integer> rootLeft=bt.addNode("left", root, 2);
		Node<Integer> rootRight=bt.addNode("right", root, 3);
		Node<Integer> rootLeftRight=bt.addNode("right", rootLeft, 4);
		Node<Integer> rootRightLeft=bt.addNode("right", rootLeftRight, 5);
		Node<Integer> rootRightRight=bt.addNode("right", rootRightLeft, 6);*/
		bt.printTree(root);
		st.verticalOrder(root);
		Iterator i = ht.entrySet().iterator();
		while(i.hasNext())
		{
			Entry<Integer, ArrayList<Integer>> e= (Entry<Integer, ArrayList<Integer>>) i.next();
			Iterator l= e.getValue().iterator();
			while(l.hasNext())
				System.out.print(l.next() + " ");
			System.out.println();
		}
	}
}