package tree;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;
public class TopViewBinaryTree {
	public static TreeMap<Integer, Integer> ht = new TreeMap<>();
	public void topView(Node root)
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
			}
			else
				ht.put(currlevel, (Integer) currNode.data);
			if(currNode.left!=null)
				Q.add(new QueuePack(currNode.left,currlevel-1));
			if(currNode.right!=null)
				Q.add(new QueuePack(currNode.right,currlevel+1));
		}
	}
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		TopViewBinaryTree st = new TopViewBinaryTree();
		int rootData = 1;
		//test case 1
		/*Node<Integer> root = bt.addNode("", null, rootData);
Node<Integer> rootLeft=bt.addNode("left", root, 2);
Node<Integer> rootRight=bt.addNode("right", root, 3);
Node<Integer> rootLeftLeft=bt.addNode("left", rootLeft, 4);
Node<Integer> rootLeftRight=bt.addNode("right", rootLeft, 5);
Node<Integer> rootRightLeft=bt.addNode("left", rootRight, 6);
Node<Integer> rootRightRight=bt.addNode("right", rootRight, 7);*/
		//test case 2
		Node<Integer> root = bt.addNode("", null, rootData);
		Node<Integer> rootLeft=bt.addNode("left", root, 2);
		Node<Integer> rootRight=bt.addNode("right", root, 3);
		Node<Integer> rootLeftRight=bt.addNode("right", rootLeft, 4);
		Node<Integer> rootRightLeft=bt.addNode("right", rootLeftRight, 5);
		Node<Integer> rootRightRight=bt.addNode("right", rootRightLeft, 6);
		bt.printTree(root);
		st.topView(root);
		Iterator i = ht.entrySet().iterator();
		while(i.hasNext())
		{
			Entry<Integer, Integer> e= (Entry<Integer, Integer>) i.next();
			System.out.print(e.getValue() + " " );
		}
	}
}