package tree;

import java.util.Scanner;

public class postorder_traversal {
	Scanner sc = new Scanner(System.in);

	public class node {
		int data;
		node left;
		node right;
	}

	private node root;

	public postorder_traversal() {
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

	public void postorder() {
		postorder(this.root);
		System.out.println();
	}

	private void postorder(node Node) {
		if (Node == null) {
			return;
		}

		postorder(Node.left);
		postorder(Node.right);
		System.out.print(Node.data + " ");

	}

	public void display() {
		display(this.root);
	}

	private void display(node n) {
		if (n == null) {
			return;
		}
		String str = "";
		str = str + n.data;
		str = "<--" + str + "-->";
		if (n.left != null) {
			str = n.left.data + str;
		} else {
			str = "." + str;
		}
		if (n.right != null) {
			str = str + n.right.data;
		} else {
			str = str + ".";
		}
		System.out.println(str);
		display(n.left);
		display(n.right);
	}
}
