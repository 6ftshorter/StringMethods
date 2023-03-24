package Test;

import java.util.Scanner;

public class NewTest {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {		
		String userInput,newString="no";
		
		System.out.println("Enter the string");
		userInput=in.next();
		char option;
		
		do {
		
			System.out.println("Enter your choice\n"
					+ "1.The input string is:\n"
					+ "2.Find character at a position\n"
					+ "3.Check if the strings are equal\n"
					+ "4.Check if the string ends with\n"
					+ "5.Check index of a character\n"
					+ "6.check if the string is empty\n"
					+ "7.Find the last index of a character\n"
					+ "8.Replace the substring\n"
					+ "9.Make a substring of the string\n");
			
			
		int x = in.nextInt();
		switch(x) {
		
		case 1:
			System.out.println("Entered  string:"+userInput);
			break;	
			
		case 2:
			
			System.out.println("Character at Position:"+findPos(userInput));
			break;	
			
		case 3:
			System.out.println("Are the two strings equal?"+userInput.equals(newString));
			break;	
			
		case 4:
			
			System.out.println("Ends with:"+userInput.endsWith(newString));
			break;	
			
		case 5:
			System.out.println("index of e: "+userInput.indexOf('e'));
			break;	
			
		case 6:
			System.out.println("Is the string empty?"+userInput.isEmpty());
			break;	
			
		case 7:
			System.out.println("The last index of the character:"+userInput.lastIndexOf('o'));
			break;	
			
		case 8:
			System.out.println("Replacing the substring:"+userInput.replaceFirst(newString, "yes"));
			break;	
			
		case 9:
			System.out.println("Substring of "+userInput+" "+userInput.substring(2));
			break;	
			
		default:
			System.out.println("Invalid input\n");
			break;

		}
		System.out.println("Do you wish to continue?(Y/N)");
		option=in.next().charAt(0);
		}while(option=='y'||option=='Y');
		}
	
	public static char findPos(String s) {
		System.out.println("Enter the position of ur choice:");
		int pos=in.nextInt();
		return s.charAt(pos);
	
	}

}
