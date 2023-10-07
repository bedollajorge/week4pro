package com.promineotech;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

		// 1. Create an array of int called ages
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };

		// #1a. Subtract the value of the first element from the last element
		int resultA = ages[ages.length - 1] - ages[0];
		System.out.println("1a. Result of subtracting the first element from the last element: " + resultA);

		// #1b. Create a new array with one more element than ages
		int[] newAges = Arrays.copyOf(ages, ages.length + 1);
		newAges[newAges.length - 1] = 42;
		System.out.println("1b. New ages array with one more element: " + Arrays.toString(newAges));

		// #1c. Calculate the average age using a loop
		int sumAges = 0;
		for (int age : ages) {
			sumAges += age;
		}

		double averageAge = (double) sumAges / ages.length;
		System.out.println("1c. Average age: " + averageAge);

		// 2. Create an array of String called names
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		// #2a. Calculate the average number of letters per name
		int totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length();
		}
		double averageLetters = (double) totalLetters / names.length;
		System.out.println("2a. Average number of letters per name: " + averageLetters);

		// #2b. Concatenate all the names together with spaces
		String concatenatedNames = String.join(" ", names);
		System.out.println("2b. Concatenated names: " + concatenatedNames);

		// 3. array[array.length - 1]

		// 4. array[0]

		// 5. Create a new array of int called nameLengths
		int[] nameLengths = new int[names.length];
		System.out.println(Arrays.toString(nameLengths));

		// Loop to calculate and store the lengths of names
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}

		// 6. Write a loop to iterate over the nameLengths array and calculate the sum
		int sumNameLengths = 0;
		for (int length : nameLengths) {
			sumNameLengths += length;
		}

		// Print the array of name lengths and the sum
		System.out.println("Name Lengths: " + Arrays.toString(nameLengths));
		System.out.println("Sum of name lengths: " + sumNameLengths);
	}

	// 7.
	public static String repeatWord(String word, int n) {
		StringBuilder repeatedWord = new StringBuilder();

		for (int i = 0; i < n; i++) {
			repeatedWord.append(word);
		}

		return repeatedWord.toString();
	}

	// 8.
	public static void main1(String[] args) {
		String firstName = "John";
		String lastName = "Doe";

		String fullName = buildFullName(firstName, lastName);
		System.out.println("Full Name: " + fullName);
	}

	// Method to build and return the full name
	public static String buildFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	// 9.
	public static void main2(String[] args) {

		int[] numbers = { 20, 30, 40, 15 };
		boolean isSumGreaterThan100 = isSumGreaterThan100(numbers);

		if (isSumGreaterThan100) {
			System.out.println("The sum is greater than 100.");
		} else {
			System.out.println("The sum is not greater than 100.");
		}

	}

	// Method to check if the sum of integers in the array is greater than 100
	public static boolean isSumGreaterThan100(int[] array) {
		int sum = 0;

		for (int number : array) {
			sum += number;
		}

		return sum > 100;
	}

	// 10.
	public static void main3(String[] args) {
		double[] values = { 10.5, 15.2, 8.7, 12.0 };
		double average = calculateAverage(values);

		System.out.println("The average is: " + average);
	}

	// Method to calculate the average of elements in the array
	public static double calculateAverage(double[] array) {
		if (array.length == 0) {
			return 0.0; // Handle the case of an empty array
		}

		double sum = 0.0;

		for (double value : array) {
			sum += value;
		}

		return sum / array.length;
	}

	// 11.
	public static void main4(String[] args) {
		double[] array1 = { 10.5, 15.2, 8.7, 12.0 };
		double[] array2 = { 5.0, 6.0, 7.0, 8.0 };
		boolean result = compareAverages(array1, array2);

		if (result) {
			System.out.println("The average of array1 is greater than the average of array2.");
		} else {
			System.out.println("The average of array1 is not greater than the average of array2.");
		}
	}

	// Simplified method to compare the averages of two double arrays
	public static boolean compareAverages(double[] array1, double[] array2) {
		return calculateAverage(array1) > calculateAverage(array2);
	}

	// Simplified method to calculate the average of elements in the array
	public static double calculateAverage1(double[] array) {

		if (array.length == 0) {
			return 0.0; // Handle the case of an empty array
		}

		double sum = 0.0;

		for (double value : array) {
			sum += value;
		}

		return sum / array.length;
	}

	// 12.
	public static void main5(String[] args) {
		boolean isHotOutside = true;
		double moneyInPocket = 15.0;
		boolean willBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);

		if (willBuyDrink) {
			System.out.println("I will buy a drink.");
		} else {
			System.out.println("I won't buy a drink.");
		}
	}

	// Method to determine if a drink will be bought
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}

	// 13.
	public static void main6(String[] args) {
		int number = 6;
		if (isEvenNumber(number)) {
			System.out.println(number + " is an even number.");
		} else {
			System.out.println(number + " is not an even number.");
		}
	}

	// Method to check if a number is even
	public static boolean isEvenNumber(int number) {
		return number % 2 == 0;
	}
	// below are the print outs for each method

	public static void main8(String[] args) {

		// 7.
		String repeatedWord = repeatWord("Hello", 3);
		System.out.println("7. Repeated word: " + repeatedWord);

		// 8.
		String fullName = buildFullName("John", "Doe");
		System.out.println("8. Full Name: " + fullName);

		// 10.
		double average = calculateAverage(new double[] { 10.5, 15.2, 8.7, 12.0 });
		System.out.println("10. Average: " + average);

		// 11.
		boolean compareAveragesResult = compareAverages(new double[] { 10.5, 15.2, 8.7, 12.0 },
				new double[] { 5.0, 6.0, 7.0, 8.0 });
		System.out.println("11. Compare Averages: " + compareAveragesResult);

		// 12.
		boolean willBuyDrinkResult = willBuyDrink(true, 15.0);
		System.out.println("12. Will buy drink? " + willBuyDrinkResult);
	}

}
