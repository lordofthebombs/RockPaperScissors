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

		if ((VALID_INPUTS.indexOf(choicePlayerOne) == -1) || (VALID_INPUTS.indexOf(choicePlayerTwo) == -1))
		{
			System.out.println("That is not valid, please enter either R, P, or S!");
		}
		
		if ((choicePlayerOne.equals("R") || choicePlayerOne.equals("r")) && (choicePlayerTwo.equals("R") || choicePlayerTwo.equals("r")))
		{
			System.out.print("Draw!");
		}
		else if ((choicePlayerOne.equals("P") || choicePlayerOne.equals("p")) && (choicePlayerTwo.equals("P") || choicePlayerTwo.equals("p")))
		{
			System.out.print("Draw!");
		}
		else if ((choicePlayerOne.equals("S") || choicePlayerOne.equals("s")) && (choicePlayerTwo.equals("S") || choicePlayerTwo.equals("s")))
		{
			System.out.print("Draw!");
		}
		// Player 1 Victories after this point
		else if ((choicePlayerOne.equals("R") || choicePlayerOne.equals("r")) && (choicePlayerTwo.equals("S") || choicePlayerTwo.equals("s")))
		{
			System.out.print("Player 1 wins!");
		}
		else if ((choicePlayerOne.equals("P") || choicePlayerOne.equals("p")) && (choicePlayerTwo.equals("R") || choicePlayerTwo.equals("r")))
		{
			System.out.print("Player 1 wins!");
		}
		else if ((choicePlayerOne.equals("S") || choicePlayerOne.equals("s")) && (choicePlayerTwo.equals("P") || choicePlayerTwo.equals("p")))
		{
			System.out.print("Player 1 wins!");
		}
		// Player 2 Victories
		else if ((choicePlayerOne.equals("S") || choicePlayerOne.equals("s")) && (choicePlayerTwo.equals("R") || choicePlayerTwo.equals("r")))
		{
			System.out.print("Player 2 wins!");
		}
		else if ((choicePlayerOne.equals("R") || choicePlayerOne.equals("r")) && (choicePlayerTwo.equals("P") || choicePlayerTwo.equals("p")))
		{
			System.out.print("Player 2 wins!");
		}
		else if ((choicePlayerOne.equals("P") || choicePlayerOne.equals("p")) && (choicePlayerTwo.equals("S") || choicePlayerTwo.equals("s")))
		{
			System.out.print("Player 2 wins!");
		}
	}
		
}