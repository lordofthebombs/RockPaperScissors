/*
*	Game by Bader Abdulwaseem
*		
*	Version 2
*
*
*
*/
import java.util.Scanner;

public class RPSGame {
	public static void main(String[] args) {
		String choicePlayerOne,choicePlayerTwo,VALID_INPUTS;
		
		
		VALID_INPUTS = "RPSrps";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Rock-Paper-Scissors!");
		System.out.print("Player 1, please make your choice: ");
		choicePlayerOne = keyboard.nextLine();
		System.out.print("Player 2, please make your choice: ");
		choicePlayerTwo = keyboard.nextLine();
		
		// This is the entire logic behind the victory conditions	
		switch (choicePlayerOne)
		{
		case "R":
			if (choicePlayerTwo.equals("P") || choicePlayerTwo.equals("p"))
			{
				System.out.print("Player Two wins!");
			}
			else if (choicePlayerTwo.equals("S") || choicePlayerTwo.equals("s"))
			{
				System.out.print("Player One wins!");
			}
			else if (choicePlayerTwo.equals("R") || choicePlayerTwo.equals("r"))
			{
				System.out.print("Draw!");
			}
			break;
		case "r":
			if (choicePlayerTwo.equals("P") || choicePlayerTwo.equals("p"))
			{
				System.out.print("Player Two wins!");
			}
			else if (choicePlayerTwo.equals("S") || choicePlayerTwo.equals("s"))
			{
				System.out.print("Player One wins!");
			}
			else if (choicePlayerTwo.equals("R") || choicePlayerTwo.equals("r"))
			{
				System.out.print("Draw!");
			}
			break;
		case "P":
			if (choicePlayerTwo.equals("P") || choicePlayerTwo.equals("p"))
			{
				System.out.print("Draw!");
			}
			else if (choicePlayerTwo.equals("S") || choicePlayerTwo.equals("s"))
			{
				System.out.print("Player Two wins!");
			}
			else if (choicePlayerTwo.equals("R") || choicePlayerTwo.equals("r"))
			{
				System.out.print("Player One wins!");
			}
			break;
		case "p":
			if (choicePlayerTwo.equals("P") || choicePlayerTwo.equals("p"))
			{
				System.out.print("Draw!");
			}
			else if (choicePlayerTwo.equals("S") || choicePlayerTwo.equals("s"))
			{
				System.out.print("Player Two wins!");
			}
			else if (choicePlayerTwo.equals("R") || choicePlayerTwo.equals("r"))
			{
				System.out.print("Player One wins!");
			}
			break;
		case "S":
			if (choicePlayerTwo.equals("P") || choicePlayerTwo.equals("p"))
			{
				System.out.print("Player One wins!");
			}
			else if (choicePlayerTwo.equals("S") || choicePlayerTwo.equals("s"))
			{
				System.out.print("Draw!");
			}
			else if (choicePlayerTwo.equals("R") || choicePlayerTwo.equals("r"))
			{
				System.out.print("Player Two wins!");
			}
			break;
		case "s":
			if (choicePlayerTwo.equals("P") || choicePlayerTwo.equals("p"))
			{
				System.out.print("Player One wins!");
			}
			else if (choicePlayerTwo.equals("S") || choicePlayerTwo.equals("s"))
			{
				System.out.print("Draw!");
			}
			else if (choicePlayerTwo.equals("R") || choicePlayerTwo.equals("r"))
			{
				System.out.print("Player Two wins!");
			}
		default:
			System.out.print("Sorry, the input must be R P or S!");
		}
		
	}
		
}
