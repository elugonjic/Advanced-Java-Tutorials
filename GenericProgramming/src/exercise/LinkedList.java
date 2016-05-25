package exercise;

public class LinkedList {
   public static void main(String[] args) {
	  //the following creates a Node of String type
      Node<String> node1 = new Node("David");
      Node<String> node2 = new Node("Raymond");
      Node<String> node3 = new Node("Cynthia");
      node1.next = node2; //linking node 1 and node 2
      node2.next = node3; //linking node 2 and node 3
      Node<String> footer = new Node("Footer"); //Node created to be the last node
      node3.next = footer; //linking node 3 with the footer
      
      Node<String> dummy; //a pointer Node
      dummy = node1; //the pointer Node starts at node1
      while(dummy.next != null) {
         System.out.println(dummy.getData());
         dummy = dummy.next; //move the pointer Node to the next Node
      }
   }
}