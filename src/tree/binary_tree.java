package tree;

import java.util.Scanner;

public class binary_tree {
	Scanner sc = new Scanner(System.in);//A true B false true C false false true D true E false true F false false false

	public class node {
		String data;
		node left;
		node right;
	}

	private node root;

	public binary_tree() {
		this.root = createtree();
	}

	public node createtree() {
		String item = sc.next();
		node nn=new node();
		nn.data=item;
		boolean hlc=sc.nextBoolean();
		if(hlc==true) {
			nn.left=createtree();
		}
		boolean hrc=sc.nextBoolean();
		if(hrc==true) {
			nn.right=createtree();
		}
		return nn;
	}
	
	public void display() {
		display(this.root);
	}
	
	private void display(node n) {
		if(n==null) {
			return;
		}
		String str="";
		str=str+n.data;
		str="<--"+str+"-->";
		if(n.left!=null) {
			str=n.left.data+str;
		}
		else {
			str="."+str;
		}
		if(n.right!=null) {
			str=str+n.right.data;
		}
		else {
			str=str+".";
		}
		System.out.println(str);
		display(n.left);
		display(n.right);
	}
	
}
