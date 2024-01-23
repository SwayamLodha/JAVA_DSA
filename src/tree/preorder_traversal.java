package tree;

import java.util.Scanner;

public class preorder_traversal {
	Scanner sc = new Scanner(System.in);

	public class node {
		int data;
		node left;
		node right;
	}

	private node root;

	public preorder_traversal() {
		this.root = createtree();
	}

	private node createtree() {
		int item = sc.nextInt();
		node nn = new node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			nn.left = createtree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc == true) {
			nn.right = createtree();
		}
		return nn;
	}

	public void preorder() {
		preorder(this.root);
		System.out.println();
	}

	private void preorder(node Node) {
		if (Node == null) {
			return;
		}
		System.out.print(Node.data + " ");
		preorder(Node.left);
		preorder(Node.right);
	}

	
}
