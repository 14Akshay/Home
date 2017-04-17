package tree;

import java.util.LinkedList;
import java.util.Queue;
public class MaximumSumLevelBinaryTree {
	static int maxLevel;
	static int maxSum;
	public void maxSumLevel(Node<Integer> root)
	{
		if(root==null)
		{
			return ;
		}
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		int level = 0;
		while(!Q.isEmpty())
		{
			int queueSize = Q.size();
			int sum =0;
			while(queueSize>0){
				Node<Integer> current = Q.remove();
				sum =sum + current.data;
				queueSize--;
				if(current.left!=null)
					Q.add(current.left);
				if(current.right!=null)
					Q.add(current.right);
			}
			if(sum>maxSum)
			{
				maxSum=sum;
				maxLevel=level;
			}
			level++;
		}
		return ;
	}
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		MaximumSumLevelBinaryTree st = new MaximumSumLevelBinaryTree();
		int rootData = 1;
		Node<Integer> root = bt.addNode("", null, rootData);
		Node<Integer> rootLeft=bt.addNode("left", root, 22);
		Node<Integer> rootRight=bt.addNode("right", root, 22);
		Node<Integer> rootLeftLeft=bt.addNode("left", rootLeft, 4);
		Node<Integer> rootLeftRight=bt.addNode("right", rootLeft, 5);
		Node<Integer> rootRightLeft=bt.addNode("left", rootRight, 6);
		Node<Integer> rootRightRight=bt.addNode("right", rootRight, 7);
		bt.printTree(root);
		st.maxSumLevel(root);
		System.out.println(maxSum + "--"+maxLevel);
	}
}
