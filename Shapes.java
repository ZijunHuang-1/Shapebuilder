import java.util.Scanner;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput = 0;
		boolean invalidnumber = true;

		// variable s is just for user to press any key to continue
		Scanner s = new Scanner(System.in);

		// input reads in user input
		Scanner input = new Scanner(System.in);

		// welcome message
		System.out.println("The program will print out shapres using numbers. ");
		System.out.println();
		System.out.println("Press enter to continue...");
		s.nextLine();

		System.out.print("Enter a number between 5 and 15: ");
		
		//input validation 
		do {
			userInput = input.nextInt();
			if (userInput >= 5 && userInput <= 15) {
				invalidnumber = false;
			} else {
				System.out.println("Sorry, " + " is not a valid number");
			}
		} while (invalidnumber);

		for (int i = 1; i <= userInput; i++) {
			for (int j = 1; j <= userInput; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// for loop to print out shape
		for (int i = 1; i <= userInput; i++) {
			for (int j = 1; j <= (userInput - i)*2; j++) {
				System.out.print(" ");
			}

			for (int k = i; k >= 1; k--) {
				System.out.print(" " + k);
			}
			for (int k = 2; k <= i; k++) {
				System.out.print(" " + k);
			}
			System.out.println();
		}
	}
}
