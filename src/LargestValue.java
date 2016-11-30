/**
 * Name: Ana Luiza Fonseca Teixeira
 * Teacher: Mr. Hardman 
 * Assignment 5, Program #3
 * Date Last Modified: 11/30/2016
 */

import java.util.Scanner;

public class LargestValue {


	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		double[] userValues = new double[5];
		double maximum;
		int index = -1;
		
		
		System.out.println("Please, enter 5 numerical values: ");
		System.out.println();
		
		for(int i = 0; i < userValues.length; i++){
			
			System.out.print("Please enter a value: ");
			userValues[i] = userInput.nextDouble();
	
		}
		
		maximum = userValues[0];
		
		for(int i = 0; i < userValues.length; i++){
			
			if(userValues[i] > maximum){
				
				maximum = userValues[i];
				
			}
			
		}
		
		System.out.println("The maximum value is: " + maximum + "!");
		
		for(int i = 0; i < userValues.length; i++){
			if(userValues[i] == maximum){
				index = i;
			}
		}
		
		System.out.println("The maximum value can be found at the index of " + index + "!");
		
		userInput.close();

	}

}
