package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
    //1. Complete the method so that it returns the sum of all
    //   of the integers in the array being passed in
    public static int sumIntArray(int[] values) {
    	int sumAddition = 0;
for(int i = 0; i < values.length; i++) {
	sumAddition = sumAddition + values[i];
}
        return sumAddition;
    }

    //2. Complete the method so that it returns the average of all
    //   of the integers in the array being passed in
    public static double averageIntArray(int[] values) {
    	double sumAdditionDivision = 0;
for(int i = 0; i < values.length; i++) {
	sumAdditionDivision = sumAdditionDivision + values[i];
}
sumAdditionDivision = sumAdditionDivision / values.length;
        return sumAdditionDivision;
    }


    //3. Complete the method so that it returns true if the integer
    //   array contains the value specified by the second parameter.
    //   It should otherwise return false.
    public static boolean containsIntValue(int[] array, int value) {
    	boolean doesContainInt = false;
for(int i = 0; i < array.length; i++) {
	if(array[i] == value) {
		doesContainInt = true;
	}
	else {
		doesContainInt = false;
	}
}
        return doesContainInt;
    }

    //4. Complete the method so that it returns the index of the,
    //   first instance that the specified value occurs in the array.
    //   If the array does not contain the specified value, it should return -1.
    public static int getIndex(int[] arr, int value) {
    	int firstInstance = 0;
    	boolean firstInstanceFound = false;
for(int i = 0; i < arr.length; i++) {
	if(firstInstanceFound == false) {
	if(arr[i] == value) {
		firstInstance = i;
		firstInstanceFound = true;
	}
	else {
		firstInstance = -1;
	}
}
	
}return firstInstance;

    }
}
