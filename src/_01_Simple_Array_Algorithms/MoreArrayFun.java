package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
public static void main(String[] args) {
	String [] allSortsOfNames = new String[11];
	
	allSortsOfNames[0] = "Matthew McCallister";
	allSortsOfNames[1] = "Ryan Anders";
	allSortsOfNames[2] = "Whitely Smith";
	allSortsOfNames[3] = "Gabriella Di Angelo";
	allSortsOfNames[4] = "Aiden Ramirez";
	allSortsOfNames[5] = "Tis";
	allSortsOfNames[6] = "Jimmy Ramirez";
	allSortsOfNames[7] = "Python";
	allSortsOfNames[8] = "Addilyn McCallister";
	allSortsOfNames[9] = "Christy Hews";
	allSortsOfNames[10] = "Python";
	
	printStrings(allSortsOfNames);
	
	reverseStrings(allSortsOfNames);
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
public static void printStrings (String [] Strings) {
	for (int i = 0; i < Strings.length; i++) {
		System.out.println(Strings[i]);
	}
}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
public static void reverseStrings (String [] Strings) {
	for(int i = Strings.length; i > 1; i--) {
		System.out.println(Strings[i]);
	}
}


    //4. Write a method that takes an array of Strings and prints every other String in the array.


    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.


}
