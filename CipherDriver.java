package project13;

import java.util.Scanner;

public class CipherDriver {
	
	public static void main(String[] args) {
		Scanner uSER_INPUT = new Scanner(System.in);		
		
		int storedInt;		
		System.out.print("Press Enter to continue . . . .");
	    uSER_INPUT.nextLine();
	    
	    System.out.println("Welcome to Encryption PRGM V1.0(A Secret Language)");
		System.out.println("Enter 1 for Transposition.\nEnter 2 for Substitution");
		storedInt=uSER_INPUT.nextInt();
		
		String answer;
		switch(storedInt) {
		case 1: 
			answer=Transposition();
			System.out.println(answer);
			break;
		case 2: 
			answer=Substitution();
			System.out.println(answer);
			break;
		}// ending bracket for switch
		uSER_INPUT.close();	
	}// Ending bracket of method main
	
	public static String Substitution() {
		Scanner uSER_INPUT = new Scanner(System.in);
		int defaultShift = 1;
		int storedInt;
		System.out.println("Welcome to Substitution Encryption");
		System.out.println("Enter 1 to decode.\nEnter 2 to encode");
		storedInt=uSER_INPUT.nextInt();
		System.out.println("What level of encryption did you use? (Higher is better)");
		defaultShift=uSER_INPUT.nextInt();
		SubstitutionCipher sCipher = new SubstitutionCipher(defaultShift);
		String answer;
		switch(storedInt) {
		case 1: 
			System.out.println("Enter the message you want to decode below:");
			answer = sCipher.decode(uSER_INPUT.next());
			break;
		case 2: 
			System.out.println("Enter the message you want to encode below:");
			answer = sCipher.encode(uSER_INPUT.next());	
			break;
		default:
			answer="ERROR";
			break;
		}// ending bracket for switch
		uSER_INPUT.close();	
		return answer;
	}// Ending bracket of method Substitution
	
	public static String Transposition() {
		Scanner uSER_INPUT = new Scanner(System.in);
		int defaultShuffle = 1;
		int storedInt;
		System.out.println("Welcome to Transposition Encryption");
		System.out.println("Enter 1 to decode.\nEnter 2 to encode");
		storedInt=uSER_INPUT.nextInt();
		System.out.println("What level of encryption did you use? (Higher is better)");
		defaultShuffle=uSER_INPUT.nextInt();
		TranspositionCipher tCipher = new TranspositionCipher(defaultShuffle);
		String answer;
		switch(storedInt) {
		case 1: 
			System.out.println("Enter the message you want to decode below:");
			answer = tCipher.decode(uSER_INPUT.nextLine());
			break;
		case 2: 
			System.out.println("Enter the message you want to encode below:");
			answer = tCipher.encode(uSER_INPUT.nextLine());	
			break;
		default:
			answer="ERROR";
			break;
		}// ending bracket for switch	
		uSER_INPUT.close();	
		return answer;
	}// Ending bracket of method Transposition
	
}// Ending bracket of class CipherDriver
