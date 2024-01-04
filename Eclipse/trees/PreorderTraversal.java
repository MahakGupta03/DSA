package trees;

import trees.FormationOfBinaryTree.BinaryTree;
import trees.FormationOfBinaryTree.Node;

public class PreorderTraversal {
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	static class BinaryTree{
		static int idx = -1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}
	}
	
	public static void preOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		preOrder(root);

	}

}
