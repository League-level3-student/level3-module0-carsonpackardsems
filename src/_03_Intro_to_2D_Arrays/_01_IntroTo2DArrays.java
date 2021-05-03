package _03_Intro_to_2D_Arrays;

import java.util.Random;

public class _01_IntroTo2DArrays {
static Random r = new Random();
    public static void main(String[] args) {
        // 1. declare a 2D array of integers with 3, 1D arrays that each hold
        //    3 integers
int [] [] array2D = {{1,2,4}, {8,16,32}, {64,128,256}};
System.out.println("Original");
for(int i = 0;  i < array2D.length; i++) {
	for(int m = 0; m < array2D[i].length; m++) {
		System.out.println(array2D[i][m]);
	}
	}
        // 2. use two for loops to set all the elements in the 2D array to
        //    a different integer
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
System.out.println("Randomized");
        for(int i = 0;  i < array2D.length; i++) {
        	int ran = r.nextInt(50);
        	for(int m = 0; m < array2D[i].length; m++) {
        		array2D[i][m] = ran;
        		System.out.println(array2D[i][m]);
        		ran = r.nextInt(50);
        	}
        }
        // 3. print the third element from the second 1D array (2DArray[1][2])
       
System.out.println(array2D[1][2]);
         System.out.println("array2D[1][2] changing...");
         // 4. set the third element from the second 1D array to a different
        //    value
array2D[1][2] = r.nextInt(50);

        // 5. print the element again and verify the value has changed
System.out.println(array2D[1][2]);
System.out.println("Changed");
    }
}
