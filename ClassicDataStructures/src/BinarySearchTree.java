/*
  	A specific type of the binary tree. It is made up of parent nodes and child nodes. 
	A parent node will have at most 2 child nodes, left and right. The root node does 
	not have a parent node.
	One of the benefits is being able to find data quickly.
*/
public class BinarySearchTree {
	public Node root;
	
	public BinarySearchTree(){
		root = null;
	}
	
	public void insert(int data){
		//a new temporary node is created everytime this method is called and its data is assigned to be the data that was passed as a parameter.
		Node newNode = new Node();
		newNode.data = data;
		
		//if there is no root node (i.e. root node is null), then the current temp node is assign
		if(root == null) root = newNode;
		//else 2 temporary nodes are created. The current will hold the root.
		else{
			Node current = root;
			Node parent;
			while(true){
				//the parent becomes the current
				parent = current;
				//if data is less than the currents data, current will become its left node. If current has become null,
				//the parents left node will become the temp node created
				if(data < current.data){
					current = current.left;
					if(current == null){
						parent.left = newNode;
						break;
					}
				//else if data is greater than the current data, current will become its right node. If current has become null,
				//the parents right will become the temp node created.
				}else{
					current = current.right;
					if(current == null){
						parent.right = newNode;
						break;
					}
				}
			}
		}
	}//end insert
	
	//There are three ways of searching a BST, in-order, pre-order, and post-order.
	public void inOrder() {
		inOrder(root);
	}
	
	private void inOrder(Node n){
		if(n != null){
			inOrder(n.left); //move all the way to the left if n is not null, recursive calls keeps going until if statement fails.
			System.out.println(n.getData());
			inOrder(n.right); //move to the right after finishing moving to the left
		}
	}
	
	public void preOrder(){
		preOrder(root);
	}
	
	private void preOrder(Node n){
		if(n != null){
			System.out.println(n.getData());
			inOrder(n.left); //move all the way to the left if n is not null, recursive calls keeps going until if statement fails.
			inOrder(n.right); //move to the right after finishing moving to the left
		}
	}
	
	public void postOrder(){
		postOrder(root);
	}
	
	private void postOrder(Node n){
		if(n != null){
			inOrder(n.left); //move all the way to the left if n is not null, recursive calls keeps going until if statement fails.
			inOrder(n.right); //move to the right after finishing moving to the left
			System.out.println(n.getData());
		}
	}
	
	
	//to find a minimum value of a BST, travel down the left side until the last node is reached.
	public int min(){
		Node current = root; //start at root
		while(current.left !=null){ //while there is still a left child node
			current = current.left; //move the node pointer to the left child, this stops when the leftmost node does not have a child
		}
		return current.getData();
	}
	
	//to find a maximum value of a BST, travel down the right side until the last node is reached.
	public int max(){
		Node current = root; //start at root
		while(current.right !=null){ //while there is still a left child node
			current = current.right; //move the node pointer to the left child, this stops when the leftmost node does not have a child
		}
		return current.getData();
	}
	
	
	
	
	
	
}
