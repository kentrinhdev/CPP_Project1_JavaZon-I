package kvtproject1;

//Class that defines a Clerk which inherits from the Person class
public class Clerk extends Person {
	private String employeeID;
	private int registerNbr;
	
	//Constructor
	public Clerk(String anID,int aRegister,
			String firstName,String lastName, String anAddress,
			String city, String state, String zip, String phone) {
		
		super(firstName, lastName, anAddress, city, state, zip, phone);
		
		registerNbr = aRegister;
	}
	
	//Getter for the employee ID
	public String getEmployeeID() {
		return employeeID;
	}

	//Getter for the employee cash register
	public int getRegisterNbr() {
		return registerNbr;
	}
	
	//Method to return summary about object
	public String toString(){
		String result="";
		
		result += super.getFirstName();
		result += "EmployeeID:\t" + employeeID + "\n";
		
		return result;
	}

}//End of Clerk class