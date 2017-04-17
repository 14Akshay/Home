package tree;

import java.util.ArrayList;
public class NodeNAry {
	int data;
	ArrayList<NodeNAry> list;
	public NodeNAry(int data, ArrayList<NodeNAry> list) {
		super();
		this.data = data;
		this.list = list;
	}
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the list
	 */
	public ArrayList<NodeNAry> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<NodeNAry> list) {
		this.list = list;
	}
}
