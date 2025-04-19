/*
 * @author Bailey Goodwin
 * @version 1.03
 * Program takes input and response appropriately, new take on "Hello Wordl!"
 */

package helloworld;

//Imports Scanner for the ability to input a value
import java.util.Scanner;

//create class
class helloworld {

		

	public static void main(String[] args) {
		
			//declares scanner and variable for response
			Scanner scnr = new Scanner(System.in);
			String response;
			boolean elseRepeat = true;
			
			//Switching while to 'true' because the String didn't work
			while(true) {
							
				System.out.println("Please enter a one word response for the computer.");
				System.out.print("Response: ");
				response = scnr.nextLine();	
							
				//create an if/else loop for specific response
				//instead of '==' use String.equals and IgnoreCase to ignore case
				if(response.equalsIgnoreCase("Hello")) {
					break;
					}
				
				else {
					
					//create while loop to reiterate else statement
					while(elseRepeat != false) {
						System.out.println("How rude, you didn't say Hello first!");
						System.out.println("Please try again.");
						System.out.print("Response: ");
						response = scnr.nextLine();
						
						//ends 2nd while loop
						if (response.equalsIgnoreCase("Hello")) {
							elseRepeat = false;
						}
					}	
					
					//breaks 1st loop
					break;
				}
				
			}
				System.out.println("Hello World and goodbye to you!");
				scnr.close();
				System.exit(0);
		}	
	}