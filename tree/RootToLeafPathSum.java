package tree;

public class RootToLeafPathSum {
	public boolean sum(Node root ,int sum)
	{
		if(root == null){
			return false;
		}
		sum = sum -(Integer)root.data;
		if(root.left == null && root.right == null)
		{
			if(sum==0)
			{
				System.out.println(root.data);
				return true;
			}
			else
			{
				return false;
			}
		}
		if(sum(root.left,sum) || sum(root.right,sum))
		{
			System.out.println(root.data);
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		RootToLeafPathSum st = new RootToLeafPathSum();
		int rootData = 1;
		Node<Integer> root = bt.addNode("", null, rootData);
		Node<Integer> rootLeft=bt.addNode("left", root, 2);
		Node<Integer> rootRight=bt.addNode("right", root, 3);
		Node<Integer> rootLeftLeft=bt.addNode("left", rootLeft, 4);
		Node<Integer> rootLeftRight=bt.addNode("right", rootLeft, 5);
		Node<Integer> rootRightLeft=bt.addNode("left", rootRight, 6);
		Node<Integer> rootRightRight=bt.addNode("right", rootRight, 7);
		bt.printTree(root);
		if(!st.sum(root,10))
		{
			System.out.println("No path found");
		}
	}
}