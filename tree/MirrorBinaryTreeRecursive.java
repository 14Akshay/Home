package tree;

public class MirrorBinaryTreeRecursive {
	public Node<Comparable<?>> mirrorTree(Node root)
	{
		if(root==null)
			return root;
		Node<Comparable<?>> left = mirrorTree(root.left);
		Node<Comparable<?>> right = mirrorTree(root.right);
		root.right =left;
		root.left=right;
		return root;
	}
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		MirrorBinaryTreeRecursive m = new MirrorBinaryTreeRecursive();
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
		Node<Comparable<?>> op = m.mirrorTree(root);
		System.out.println("------ Mirror Tree---------");
		bt.printTree(op);
	}
}