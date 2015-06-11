import java.io.Console;

public class Fibonacci {
	
	private boolean odd = true;
	private int n1 = 0;
	private int n2 = 1;
	private int currentValue = n1+n2;
	private int attempt = 3;
	

	public void displayNumberInSequence(int num) {
		if (num < 3) {
			System.out.println("The requested number must be at least 3!");
			return;
		}
		if (num > 40) {
			System.out.println("The requested number must be 40 or lower.");
			return;
		}
		if (num == attempt) {
			System.out.println("Number " + num + " in the Fibonacci sequence is " + currentValue);
			return;
		}
		if (odd) {
			n1 = currentValue;
		} else {
			n2 = currentValue;
		}
		attempt += 1;
		currentValue = n1+n2;
		odd = !odd;
		displayNumberInSequence(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fibonacci = new Fibonacci();
		Console console = System.console();
		System.out.println("Enter a Fibonacci sequence number between 3 and 40: ");
		String fibNumString = console.readLine();
        try{
        	int fibNum = Integer.parseInt(fibNumString);
        	fibonacci.displayNumberInSequence(fibNum);
        }catch(NumberFormatException e){
            System.err.println("Must be a number!");
        }
		
	}

}
