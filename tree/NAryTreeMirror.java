package tree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
public class NAryTreeMirror {
	public NodeNAry addNode(NodeNAry node,NodeNAry root)
	{
		if(root==null)
		{
			return node;
		}
		ArrayList<NodeNAry> temp;
		if(root.list!=null)
			temp = root.list;
		else
			temp = new ArrayList<>();
		temp.add(node);
		root.list=temp;
		return node;
	}
	public void mirrorTree(NodeNAry root)
	{
		if(root ==null)
			return;
		int childSize = root.list!=null?root.list.size():0;;
		if(childSize<2)
			return;
		for(int i=0;i<childSize;i++)
		{
			mirrorTree(root.list.get(i));
		}
		Collections.reverse(root.list);
	}
	public void levelOrder(NodeNAry root)
	{
		if(root==null)
		{
			return ;
		}
		Queue<NodeNAry> Q = new LinkedList();
		Q.add(root);
		while(!Q.isEmpty())
		{
			int n= Q.size(); // for sepration of levels
			while(n>0){
				NodeNAry temp = Q.remove();
				System.out.print(temp.data + " " );
				int listEle= temp.list!=null?temp.list.size():0;
				int count=0;
				while(listEle!=count)
				{
					Q.add(temp.list.get(count));
					count++;
				}
				n--;
			}
			System.out.println(); //for sepration of levels
		}
	}
	public static void main(String args[])
	{
		NAryTreeMirror tree = new NAryTreeMirror();
		NodeNAry root = tree.addNode(new NodeNAry(1, null), null);
		NodeNAry child1= tree.addNode(new NodeNAry(2, null), root);
		NodeNAry child2= tree.addNode(new NodeNAry(3, null), root);
		NodeNAry child3= tree.addNode(new NodeNAry(4, null), root);
		NodeNAry child4= tree.addNode(new NodeNAry(5, null), child3);
		NodeNAry child5= tree.addNode(new NodeNAry(6, null), child3);
		NodeNAry child6= tree.addNode(new NodeNAry(7, null), child4);
		NodeNAry child7= tree.addNode(new NodeNAry(8, null), child4);
		tree.levelOrder(root);
		System.out.println("-----------");
		tree.mirrorTree(root);
		System.out.println("-----------");
		tree.levelOrder(root);
		System.out.println();
	}
}
