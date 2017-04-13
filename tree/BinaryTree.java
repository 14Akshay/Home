package tree;

public class BinaryTree {
	public Node addNode(String side,Node parent,int data)
	{
		Node child = new Node(data);
		if("left".equalsIgnoreCase(side))
			parent.left =child;
		else if("right".equalsIgnoreCase(side))
			parent.right= child;
		return child;
	}
	public void printTree(Node root)
	{
		BTreePrinter b = new BTreePrinter();
		b.printNode(root);
	}
}
