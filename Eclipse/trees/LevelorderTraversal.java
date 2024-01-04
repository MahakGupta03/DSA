package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelorderTraversal {

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	static class BinaryTree {
		static int idx = -1;

		public static Node buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}
	}

	public static void levelOrder(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while (!q.isEmpty()) {
			Node curr = q.remove();
			if (curr == null) {
				System.out.println();
				if (q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}

			} else {
				System.out.print(curr.data + " ");
				if(curr.left!=null) {
					q.add(curr.left);
				}
				if(curr.right!=null) {
					q.add(curr.right);
				}

			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		levelOrder(root);

	}

}
