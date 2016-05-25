//This class uses the Stack data structure
import java.util.Stack;
public class StackEx {
	public static void main(String[] args) {
		//All the objects stored in the Stack are of the Object data type.
		Stack names = new Stack();
		//elements are added using push
		names.push("Ray");
		names.push("Cindy");
		names.push("Sasha");
		//peek is used to view the top of the stack
		System.out.println("Top of stack: " + names.peek());
		//pop is used to remove the top element, which is Sasha in this case.
		names.pop();
		System.out.println("Top of stack: " + names.peek());
		names.pop();
		System.out.println("Top of stack: " + names.peek());
		//check if empty
		if(!names.empty()) names.pop();
		//peek cannot be called on an empty stack, therefore check if it stack is empty
		if(!names.empty()) System.out.println("Top of stack: " + names.peek());
		else System.out.println("Stack empty");
		
		//An element of the stack can also be placed inside another variable, but it has to be casted.
		names.push("Sofie");
		String a = (String)names.pop();
		//int b = (int)names.pop(); error, must be same type
		System.out.println(a);
		
		//an example code to iterate through an entire stack
		names.push("Jim");
		names.push("Tammy");
		names.push("Elektra");
		while(!names.isEmpty()) System.out.print(names.pop() + " ");
	
		//reversing a stack by placing into another stack
		names.push("Jim");
		names.push("Tammy");
		names.push("Elektra");
		Stack reversal = new Stack();
		while(!names.isEmpty()) reversal.push(names.pop());
		while(!reversal.isEmpty()) System.out.print(reversal.pop() + " ");

	}

}
