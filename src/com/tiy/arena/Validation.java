package com.tiy.arena;

public class Validation {
	

	public static boolean selectionIsValid(String numChosen) {
		
		try {

            int isValid = Integer.parseInt(numChosen);
            if ((isValid < 0) || (isValid > 3)) {
                return true;
            }
            return false;
        }

        catch (NumberFormatException e) {
            return true;
        }

    }

    
    public static boolean userThrow(String numChosen) {

        try {

            int isValid = Integer.parseInt(numChosen);
            if ((isValid < 0) || (isValid > 5)) {
                return true;
            }
            return false;
        }

        catch (NumberFormatException e) {
            return true;
        }

    }
}
