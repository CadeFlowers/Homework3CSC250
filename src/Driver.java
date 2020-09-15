import java.util.Scanner;
public class Driver 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter in a decimal number:"); // Asking for #
		Scanner myNumber = new Scanner(System.in); // Taking in input
		String NumberAsString = myNumber.nextLine(); // Taking it in as a string
		
		int Number = Integer.parseInt(NumberAsString); // Making an integer variable
		
		String BinaryNumber = ""; // creating string for Binary Number
		while(Number != 0) // creating loop for Conversion
			{
			int a = Number % 2; // finding the remainder
			Number = Number / 2; // Dividing number by 2 
			BinaryNumber = a + BinaryNumber; // Combining Strings 
			}
		System.out.println(BinaryNumber + " " + "is the binary version of your number!"); // printing out final product
	}
}
