package _00_Intro_To_Arrays;

import java.util.ArrayList;
import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		// 1. declare and Initialize an array 5 Strings
		Random r = new Random();
		ArrayList<String> Strings = new ArrayList<String>();
		int savespot = 0;
		Strings.add("Strong Bad");
		Strings.add("The Cheat");
		Strings.add("Homestar");
		Strings.add("Strong Sad");
		Strings.add("King of Town");
		// 2. print the third element in the array
		System.out.println(Strings.get(2));
		// 3. set the third element to a different value
		Strings.set(2, "Bubs");
		// 4. print the third element again
		System.out.println(Strings.get(2));
		// 5. use a for loop to set all the elements in the array to a string
		// of your choice
		for (int i = 0; i < Strings.size(); i++) {
			Strings.set(i, "Mantis");
		}
		for (int i = 0; i < Strings.size(); i++) {
			System.out.println(Strings.get(i));
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		int[] ints = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
		// 7. make an array of 50 integers

		// 8. use a for loop to make every value of the integer array a random
		// number
		for (int i = 0; i < ints.length; i++) {
			ints[i] = r.nextInt();
		}
		// 9. without printing the entire array, print only the smallest number
		// on the array
		for(int i = 0; i<ints.length; i++) {
			savespot = ints[0];
			if(ints[i] < savespot) {
				savespot = ints[i];
			}
		}
		System.out.println(savespot);
		// 10 print the entire array to see if step 8 was correct

		// 11. print the largest number in the array.

		for(int i = 0; i<ints.length; i++) {
			savespot = ints[0];
			if(ints[i] > savespot) {
				savespot = ints[i];
			}
		}
		System.out.println(savespot);
		// 12. print only the last element in the array
		System.out.println(ints.length -1);

	}
}
