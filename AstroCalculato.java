package Astro.AstroCalculato;

import java.util.Scanner;

public class AstroCalculato {

	public static void main(String[] args) {
	
		
		int ultimateNumber = 5 * 5;
		double firstNumber = 0;
		double secondNumber = 0;
		double result;
		double memoryValue = 0;
		int memoryYesNo;
		boolean memoryState = false;
		boolean firstCalculation = true;
		
		
		try(Scanner astroScanner = new Scanner(System.in)) {
		
		while(true) {
			
			if (firstCalculation) {
				System.out.println("Welcome to Astro's awesome arithmetic calculator!");
						System.out.println("Type 'add', 'subtract', 'multiply', 'divide', or 'ultimateNumber' to continue");
			}
			else {
				System.out.println("Astro's awesome arithmetic calculator is always correct. ");
						if(memoryState) { System.out.println("currentResult: " + memoryValue); }
						System.out.println("Type either 'add', 'subtract', 'multiply', 'divide', or 'ultimateNumber' to continue");
			}
	
			String choice = astroScanner.nextLine();
			
			switch (choice) {
			case "add":
				if (memoryState) {
					firstNumber = memoryValue;
					System.out.println(memoryValue + " is stored as the first Double");
				}
				else {
					System.out.println("Input the first Double");
					firstNumber = astroScanner.nextDouble();
				}
				System.out.println("Input the second Double");
				secondNumber = astroScanner.nextDouble();
				result = firstNumber+secondNumber;
				System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + result);
				System.out.println("Save the result for next calculation? 1 for yes or 2 for no");
				
				memoryYesNo = astroScanner.nextInt();
				if(memoryYesNo == 1) {
					memoryValue = result;
					memoryState = true;
				}
				else if (memoryYesNo == 2){
					memoryValue = 0;
					memoryState = false;
				}
				else {
					System.out.println("it was a simple y/n question but you failed it, so no memory save for you ('_' )  ");
				}
				firstCalculation = false;
				astroScanner.nextLine();
				break;
			
			case "subtract":
				if (memoryState) {
					firstNumber = memoryValue;
					System.out.println(memoryValue + " is stored as the first Double");
				}
				else {
					System.out.println("Input the first Double");
					firstNumber = astroScanner.nextDouble();
				}
				System.out.println("Input the second Double");
				secondNumber = astroScanner.nextDouble();
				result = firstNumber-secondNumber;
				System.out.println(firstNumber + " minus " + secondNumber + " is " + result);
				System.out.println("Save the result for next calculation? 1 for yes or 2 for no");
				
				memoryYesNo = astroScanner.nextInt();
				if(memoryYesNo == 1) {
					memoryValue = result;
					memoryState = true;
				}
				else if (memoryYesNo == 2){
					memoryValue = 0;
					memoryState = false;
				}
				else {
					System.out.println("it was a simple y/n question but you failed it, so no memory save for you ('_' )");
				}
				firstCalculation = false;
				astroScanner.nextLine();
				break;
			
			case "multiply":
				if (memoryState) {
					firstNumber = memoryValue;
					System.out.println(memoryValue + " is stored as the first Double");
				}
				else {
					System.out.println("Input the first Double");
					firstNumber = astroScanner.nextDouble();
				}
				System.out.println("Input the second Double");
				secondNumber = astroScanner.nextDouble();
				result = firstNumber*secondNumber;
				System.out.println("The product of " + firstNumber + " and " + secondNumber + " is " + result);
				System.out.println("Save the result for next calculation? 1 for yes or 2 for no");
				
				memoryYesNo = astroScanner.nextInt();
				if(memoryYesNo == 1) {
					memoryValue = result;
					memoryState = true;
				}
				else if (memoryYesNo == 2){
					memoryValue = 0;
					memoryState = false;
				}
				else {
					System.out.println("it was a simple y/n question but you failed it, so no memory save for you ('_' )");
				}
				firstCalculation = false;
				astroScanner.nextLine();
				break;
			
			case "divide":
				if (memoryState) {
					firstNumber = memoryValue;
					System.out.println(memoryValue + " is stored as the first Double");
				}
				else {
					System.out.println("Input the first Double");
					firstNumber = astroScanner.nextDouble();
				}
				System.out.println("Input the second Double");
				secondNumber = astroScanner.nextDouble();
				result = firstNumber/secondNumber;
				System.out.println(firstNumber + " divided by " + secondNumber + " is " + result);
				System.out.println("Save the result for next calculation? 1 for yes or 2 for no");
				
				memoryYesNo = astroScanner.nextInt();
				if(memoryYesNo == 1) {
					memoryValue = result;
					memoryState = true;
				}
				else if (memoryYesNo == 2){
					memoryValue = 0;
					memoryState = false;
				}
				else {
					System.out.println("it was a simple y/n question but you failed it, so no memory save for you ('_' )");
				}
				firstCalculation = false;
				astroScanner.nextLine();
				break;
			
			case "ultimateNumber":
				System.out.println("5 x 5 = " + ultimateNumber);
				if(memoryState) {
					System.out.println("The ultimateNumber is so awesome it killed your savedResult");
				}
				System.out.println("The ultimateNumber cannot be saved");
				firstCalculation = false;
				memoryValue = 0;
				memoryState = false;
				break;
			
			default:
				System.out.println("The instructions were pretty clear.. try again");
		        
			}//end switch
			
		}//end game loop
		
		}//close scanner
		
	}//end main

}//end class




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
