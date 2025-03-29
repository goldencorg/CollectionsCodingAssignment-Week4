package collectionsAssignment;

import java.util.*;

public class CollectionsAssignment {

	public static void main(String[] args) {
		
		//Question 1 -
		/* 
		 * created int arrays called ages and ages2; assigned their respective values;
		 * subtracted first element from last element in each array; iterated through
		 * each array with for loops; added ages up in each array and then found average
		 */
		System.out.println("Question 1:\n");
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length - 1] - ages[0]);

		int[] ages2 = {65, 25, 89, 2, 45, 9, 54, 32, 99};
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
		
		int agesTotal = 0;
		for (int i = 0; i < ages.length; i++) {
			agesTotal += ages[i];
		}
		System.out.println("The average of the ages array is " + agesTotal / ages.length + ".");
		
		int ages2Total = 0;
		for (int i = 0; i < ages2.length; i++) {
			ages2Total += ages2[i];
		}
		System.out.println("The average of the ages2 array is " + ages2Total / ages2.length + ".");
		
		//Question 2 -
		/* 
		 * created array of names; iterated through adding up name lengths; found average;
		 * iterated through again to add each name to a blank string
		 */
		System.out.println("\nQuestion 2:\n");
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int nameLengthTotal = 0;
		for (int i = 0; i < names.length; i++) {
			nameLengthTotal += names[i].length();
		}
		int avgNameLength = nameLengthTotal / names.length;
		System.out.println("The average name length in the names array is " + avgNameLength + ".");
		
		String blankString = "";
		for (int i = 0; i < names.length; i++) {
			blankString += names[i] + " ";
		};
		System.out.println(blankString);
		
		//Question 3 -
		/*
		 *  accessed last element of array
		 */
		System.out.println("\nQuestion 3:\n");
		
		System.out.println("names[names.length - 1] returns the last element:\n" + names[names.length - 1]);
		
		//Question 4 -
		/* 
		 * accessed first element of array 
		 */
		System.out.println("\nQuestion 4:\n");
				
		System.out.println("names[0] returns the first element:\n" + names[0]);
		
		//Question 5 - 
		/* 
		 * created int array; iterated through previous array of names; added length of each
		 * name to new array 
		 */
		System.out.println("\nQuestion 5:\n");
		
		int[] nameLength = new int[names.length];
		for (int i = 0; i < nameLength.length; i++) {
			nameLength[i] = names[i].length();
		}
		System.out.println("The length of each name in the names array is:\n" + Arrays.toString(nameLength));
		
		//Question 6 -
		/* 
		 * iterated through previous array of name length; added up 
		 */
		System.out.println("\nQuestion 6:\n");
		
		int nameLengthArrTotal = 0;
		for (int i = 0; i < nameLength.length; i++) {
			nameLengthArrTotal += nameLength[i];
		}
		System.out.println("The sum of all of the names is " + nameLengthArrTotal + ".");
		
		//Question 7 - 
		/* 
		 * created method that will concatenate a word a certain amount of times;
		 * using a for loop that will go on until a designated amount of times by parameter;
		 * word will keep being added to blank string until reach designated amount
		 */
		System.out.println("\nQuestion 7:\n");
		
		System.out.println("The concatenated word is:\n" + wordConcatenator("Hello", 3));
		
		//Question 8 -
		/* 
		 * created method that adds two strings together with a space in between
		 */
		System.out.println("\nQuestion 8:\n");
		
		System.out.println("My full name is " + nameConcatenator("Nathan", "Aguilar") + ".");
		
		//Question 9 - 
		/* 
		 * created method that will add each array element together; checks if sum is
		 * greater than 100 with if statement; returns boolean value
		 */
		System.out.println("\nQuestion 9:\n");
		
		int[] randNumArray = {9, 29, 10, 50, 40};
		System.out.println("The sum of array being greater than 100 is " + isArrayGreaterThan100(randNumArray) + ".");
		
		//Question 10 -
		/* 
		 * created method that takes array of doubles; using for loop to add up elements;
		 * find average and return that value
		 */
		System.out.println("\nQuestion 10:\n");
		
		double[] randDubArray = {22.42, 75.32, 93.45, 23.43, 54.21, 67.97};
		System.out.println("The average of the array is: " + dubArrAvg(randDubArray));
		
		//Question 11 -
		/* 
		 * created method that takes two arrays of doubles; compares averages of each;
		 * returns boolean value based on if first array is greater than second one
		 */
		System.out.println("\nQuestion 11:\n");
		
		double[] firstDubArr = {22.42, 75.32, 93.45};
		double[] secondDubArr = {23.43, 54.21, 67.97};
		System.out.println("Average of firstDubArr is greater than secondDubArr:\n" + isFirstArrGreaterThanSecond(firstDubArr, secondDubArr));
		
		//Question 12 -
		/* 
		 * created method that takes boolean and double; if both parameters meet conditions
		 * in if statement, it returns true; false if not
		 */
		System.out.println("\nQuestion 12:\n");
		
		boolean isHotOutside = true;
		double moneyInPocket = 12.45;
		System.out.println("I will go buy a drink:\n" + willBuyDrink(isHotOutside, moneyInPocket));
		
		//Question 13 -
		/* 
		 * created password checker that takes user input; unlimited attempts until correct
		 * password is reached using a while loop
		 */
		System.out.println("\nQuestion 13:\n");
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your password:");
		String passwordAttempt = sc.nextLine();
		boolean result = passwordChecker(passwordAttempt);
		while (result == false) {
			System.out.println("\nPassword is incorrect! Try again:");
			passwordAttempt = sc.nextLine();
			result = passwordChecker(passwordAttempt);
		} 
		if (result == true){
			System.out.println("\nPassword is correct!");
			sc.close();
		}
		
	}

	public static String wordConcatenator(String word, int n) {
		String concatWord = "";
		for (int i = 0; i < n; i++) {
			concatWord += word;
		}
		return concatWord;
	}
	
	public static String nameConcatenator(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public static boolean isArrayGreaterThan100(int[] numArr) {
		int numArrTotal = 0;
		for (int i = 0; i < numArr.length; i++) {
			numArrTotal += numArr[i];
		}
		if (numArrTotal > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double dubArrAvg(double[] dubArr) {
		double dubArrTotal = 0;
		for (int i = 0; i < dubArr.length; i++) {
			dubArrTotal += dubArr[i];
		}
		double dubArrAvg = dubArrTotal / dubArr.length;
		return dubArrAvg;
	}
	
	public static boolean isFirstArrGreaterThanSecond(double[] firstArr, double[] secondArr) {
		double firstDubArrTotal = 0;
		double secondDubArrTotal = 0;
		for (int i = 0; i < firstArr.length; i++) {
			firstDubArrTotal += firstArr[i];
		}
		for (int i = 0; i < secondArr.length; i++) {
			secondDubArrTotal += secondArr[i];
		}
		double firstDubArrAvg = firstDubArrTotal / firstArr.length;
		double secondDubArrAvg = secondDubArrTotal / secondArr.length;
		if (firstDubArrAvg > secondDubArrAvg) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean passwordChecker(String passwordAttempt) {
		String password = "java";
		boolean validity = passwordAttempt.equals(password);
		return validity;
	}
	
}
