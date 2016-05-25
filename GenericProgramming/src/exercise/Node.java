package exercise;
public class Node<T> { //has one type parameters, which will be the type of data that the node will store
    private T data;
    public Node next; //hold the node that the current node will be pointing to

    public Node(T data) {
       this.data = data;
       next = null;
    }

    
    T getData() { //method to return the data. the return type is generic, so its of type matching data
       return data;
    }
}