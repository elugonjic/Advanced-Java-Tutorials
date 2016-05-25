//BinarySearchTree tester
public class BTree {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(8);
		bst.insert(7);
		bst.insert(13);
		bst.insert(3);
		bst.insert(10);
		bst.insert(6);
		bst.insert(4);
		bst.insert(1);
		bst.insert(14);
		bst.inOrder();
		//bst.preOrder();
		//System.out.println("The minimum value is: " + bst.min());
		//System.out.println("The maximum value is: " + bst.max());

	}

}
