/*
Name: Aaron Beehoo
Student ID: 991 284 707
Assignment: ValidatePassword

This Program validates a password based off of 3 criteria
 */
package ca.beehooaa;

public class Validate {

	public static boolean validateMinLength(String pass) {
		if (pass.length() >= 8) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validateAlpha(String pass) {
		int counter = 0;
		for (int i = 0; i < pass.length(); i++) {
			if (!Character.isLetterOrDigit(pass.charAt(i))) {
				counter++;
			}
		}
		if (counter >= 1) {
			return false;
		}
		return true;

	}

	public static boolean validateMinNum(String pass) {
		int counter = 0;
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i))) {
				counter++;
			}

		}
		if (counter >= 2) {
			return true;
		}
		return false;
	}

}
