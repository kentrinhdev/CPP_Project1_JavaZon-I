package kvtproject1;
//Import Java GUI
import javax.swing.JOptionPane;

public class Validator {
	
	//TODO - CODE THE VALIDATOR
	//-------------------------------------------------------------------------------------------------
	//	Validate the Quantity
	//-------------------------------------------------------------------------------------------------
	public static String getValidQuantity(String input){
		
		while(isValidQuantity(input) == false){
			input = JOptionPane.showInputDialog("The Quantity entered: [" + input + "] is invalid!\nRe-Enter a Quantity of 1 or greater: ");
		}
		return input;
	}
	
	public static boolean isValidQuantity(String aString){
		boolean result = false;
		
		try{
			//test input is a valid integer
			int aQuantity = Integer.parseInt(aString);
			
			//test input is greater than 0
			if(aQuantity > 0){
				//only then set the result of this method to true
				result = true;
			}
		}catch(Exception ex){
			result = false;
		}
		return result;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the First Name
	//-------------------------------------------------------------------------------------------------
	private static boolean isValidFirstName(String anInput){
		boolean result = false;
		//TODO add your code here
		if(anInput.matches("[a-zA-Z ,]+") && anInput != null && anInput.length() > 2){
			result = true;
		}
		return result;
	}
	public static String getValidFirstName(String anInput){
		//TODO add your code here
		while(isValidFirstName(anInput) == false){
			anInput = JOptionPane.showInputDialog("The First Name entered: [" + anInput + "] is invalid!\nRe-Enter the First Name: ");
		}
		return anInput;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the Last Name
	//-------------------------------------------------------------------------------------------------
	private static boolean isValidLastName(String anInput){
		boolean result = false;
		//TODO add your code here
		if(anInput.matches("[a-zA-Z ,]+") && anInput != null && anInput.length() > 1){
			result = true;
		}
		return result;
	}
	public static String getValidLastName(String anInput) {
		// TODO Auto-generated method stub
		while(isValidLastName(anInput) == false){
			anInput = JOptionPane.showInputDialog("The Last Name entered: [" + anInput + "] is invalid!\nRe-Enter the Last Name: ");
		}
		return anInput;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the Street Address
	//-------------------------------------------------------------------------------------------------
	private static boolean isValidStreet(String anInput){
		boolean result = false;
		//TODO add your code here
		if(anInput.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)") && anInput != null && anInput.length() > 2){
			result = true;
		}
		return result;
	}
	public static String getValidStreet(String anInput){
		//TODO add your code here
		while(isValidStreet(anInput) == false){
			anInput = JOptionPane.showInputDialog("The Street Address entered: [" + anInput + "] is invalid!\nRe-Enter the Street Address: ");
		}
		return anInput;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the City
	//-------------------------------------------------------------------------------------------------
	private static boolean isValidCity(String anInput){
		boolean result = false;
		//TODO add your code here
		if(anInput.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)") && anInput != null && anInput.length() > 2){
			result = true;
		}
		return result;
	}
	public static String getValidCity(String anInput){
		//TODO add your code here
		while(isValidCity(anInput) == false){
			anInput = JOptionPane.showInputDialog("The City entered: [" + anInput + "] is invalid!\nRe-Enter the City: ");
		}
		return anInput;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the State
	//-------------------------------------------------------------------------------------------------	
	private static boolean isValidState(String anInput){
		boolean result = false;
		//TODO add your code here
		if(anInput.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)") && anInput != null && anInput.length() == 2){
			result = true;
		}
		return result;
	}
	public static String getValidState(String anInput){
		//TODO add your code here
		while(isValidState(anInput) == false){
			anInput = JOptionPane.showInputDialog("The two-letter State code entered: [" + anInput + "] is invalid!\nRe-Enter the two-letter State code: ");
		}
		return anInput;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the Zip Code
	//-------------------------------------------------------------------------------------------------	
	private static boolean isValidZip(String anInput){
		boolean result = false;
		//TODO add your code here
		if(anInput.matches("\\d{5}") && anInput != null && anInput.length() == 5){
			result = true;
		}
		return result;
	}
	public static String getValidZip(String anInput){
		//TODO add your code here
		while(isValidZip(anInput) == false){
			anInput = JOptionPane.showInputDialog("The five-digit Zip code entered: [" + anInput + "] is invalid!\nRe-Enter the five-digit Zip code: ");
		}
		return anInput;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the Phone Number
	//-------------------------------------------------------------------------------------------------	
	private static boolean isValidPhone(String anInput){
		boolean result = false;
		//TODO add your code here
		if(anInput.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}") && anInput != null && anInput.length() == 12){
			result = true;
		}
		return result;
	}
	public static String getValidPhone(String anInput){
		//TODO add your code here
		while(isValidPhone(anInput) == false){
			anInput = JOptionPane.showInputDialog("The ten-digit Phone number entered: [" + anInput + "] is invalid!\nRe-Enter the ten-digit Phone number with dashes: ");
		}
		return anInput;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the Membership ID Number
	//-------------------------------------------------------------------------------------------------		
	private static boolean isValidMembership(String anInput){
		boolean result = false;
		//TODO add your code here
		if(anInput.matches("[a-zA-Z]{2,2}[0-9]{4,4}") && anInput != null && anInput.length() == 6){
			result = true;
		}
		return result;
	}
	public static String getValidMembership(String anInput){
		//TODO add your code here
		while(isValidMembership(anInput) == false){
			anInput = JOptionPane.showInputDialog("The 2-letter 4-digit Membership number entered: [" + anInput + "] is invalid!\nRe-Enter the 2-letter 4-digit Membership number: ");
		}
		return anInput;
	}//End ValidMembership method
	
}//End Validator class