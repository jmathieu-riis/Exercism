class ArmstrongNumbers {

	/**
	 * Convert the given integer into an integer array of its digits
	 **/
	private int[] numberToDigitArray(int number) {
		// Convert integer to string for easy digit manipulation
		String numAsString = Integer.toString(number);
		// Convert string to character array
		char[] charDigits = numAsString.toCharArray();
		// Prepare integer array to store the digits of the given number as integers
		int[] digitArray = new int[charDigits.length];
		// Convert the characters in charDigits to integers and add them to the digitArray
		for (int i = 0; i < charDigits.length; ++i) {
			digitArray[i] = Integer.parseInt(Character.toString(charDigits[i]));
		}
		return digitArray;
	}

	/**
	 * return true if the given number is the sum of its own digits each raised to the power of the number of digits.
	 **/
	boolean isArmstrongNumber(int numberToCheck) {
		int[] myDigits = numberToDigitArray(numberToCheck);


		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
		
	}

}
