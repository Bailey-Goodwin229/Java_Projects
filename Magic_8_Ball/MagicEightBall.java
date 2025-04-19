/*
 * @author Bailey Goodwin
 * @version 1.00
 * program simulates a magic eight ball, ask it questions and receive an answer! 
 */

//imports Scanner for input
import java.util.Random;
import java.util.Scanner;

//creates class for program
public class MagicEightBall {
	
	//Creates main function
	public static void main(String[] args) {
		
		//initializes scanner and variables
		Scanner scnr = new Scanner(System.in);
		String question; 
		Random random = new Random(20);
		int randomNumber = random.nextInt(20);
		
		
		//use .repeat feature to help create main menu
		String border = "*".repeat(44);
		
		//Create an array with 20 items
		String[] magicAnswers = new String[20];
		
		//set 20 responses for the magic 8-ball answers
		//affirmative answers
		magicAnswers[0] = "It is certain";
		magicAnswers[1] = "It is decidely so";
		magicAnswers[2] = "Without a doubt";
		magicAnswers[3] = "Yes definitely";
		magicAnswers[4] = "You may rely on it";
		magicAnswers[5] = "As I see it, yes";
		magicAnswers[6] = "Most likely";
		magicAnswers[7] = "Outlook good";
		magicAnswers[8] = "Yes";
		magicAnswers[9] = "Signs point to yes";
		
		//non-commital answers
		magicAnswers[10] = "Reply hazy, try again";
		magicAnswers[11] = "Ask again later";
		magicAnswers[12] = "Better not tell you now";
		magicAnswers[13] = "Cannot predict now";
		magicAnswers[14] = "Concentrate and ask again";
		
		//negative answers
		magicAnswers[15] = "Don't count on it";
		magicAnswers[16] = "My reply is no";
		magicAnswers[17] = "My sources say no";
		magicAnswers[18] = "Outlook not so good";
		magicAnswers[19] = "Very doubtful";
				
		//create main menu
		System.out.println(border);
		System.out.println("*    Welcome to the Magic 8-Ball.          *");
		System.out.println("*    Please ask any question.              *");
		System.out.println("*    The universe will return an answer.   *");
		System.out.println("*    Enter 'Exit' to quit the program.     *");
		System.out.println(border);
		System.out.println(border);
		System.out.println("What is your question?");
		
		//while loop to keep responses going
		while (true ) {
			
			question = scnr.nextLine();
			
			//create option using if statement to end the program
			if (question.equalsIgnoreCase("Exit")) {
				
				System.out.println("Thank you for questions.");
				System.out.println("The universe needs to rest now.");
				System.out.println("Goodbye.");
				scnr.close();
				break;
			}
			
			//gets random number, pulls answer from list, generates next number and repeats
			System.out.println(magicAnswers[randomNumber]);
			randomNumber = random.nextInt(20);
			System.out.println(border);
			System.out.print("Next Question: ");
		
		}
		System.exit(0);		
	}
	
}
