package tree;

import java.util.Scanner;

 class binary_search_tree {
	

	 class node {
		
		String data;
		node left;
		node right;
	}

	public node(String item) {
		data=item;
		left=right=null;
	}
	node root;
	public binary_search_tree() {
		// TODO Auto-generated constructor stub
		root=null;
	}
	binary_search_tree(String value){
		root=new node(value);
	}
	void insert(String data) {
		root=insertRec(root,data);
	}
	node insertRec(node root, String data) {
		if(root)
	}
	
	}
	