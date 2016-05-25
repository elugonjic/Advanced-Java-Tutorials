//This class uses a stack to convert a decimal to binary
import java.util.Stack;
public class Convert {
	
	static String binary(int number){
	//binaries are always base 2
	final int base = 2;
	//stack will hold the digits
	Stack digits = new Stack();
	
	/* In the following do-while loop, the remainder of the number divided by base is pushed into the digits stack.  
	 * Afterwards, the number is divided by 2, rounded down due to being an integer.
	 * This loop continues until number is 0.
	 * Lastly, the bits from the digits stack are popped off and placed into a String.
	*/
	
	do{
		digits.push(number % base); //this will push onto the stack a bit, created from the leftover of number/base. 5%2 is 1, 1%2 is 0. 0%2 is 1.
		number /= base; //divide number by base and store back into number and continue to the next placeholder. 5/2 is 2.
		//System.out.println(number + " " + digits.peek());

		}while(number != 0);
		
		String bits = "";
		while(!digits.empty()){
			//grab the top digit with peek before popping off
			bits += digits.peek();
			digits.pop();
		
			//another way to do the above
			//bits += digits.pop;
		}
		return bits;
	}

	public static void main(String[] args){
		int num = 5; //5 converted to binary is 101
		int num2 = 17;
		System.out.println(num + " in binary is " + binary(num));
		System.out.println(num2 + " in binary is " + binary(num2));

	}
}

