package kvtproject1;

//Class that defines a Customer which inherits from the Person class
public class Customer extends Person {
	private String memberShipID; 

	//Constructor
	public Customer(String firstName, String lastName, String anAddress,
			String city, String state, String zip, String phone, String aMemberShipID) {
		
		super(firstName, lastName, anAddress, city, state, zip, phone);
		
		memberShipID = aMemberShipID;
	}
	
	//Method to return summary about object
	public String toString(){
		String result="";
		
		result += "Member ID: " + memberShipID + "\n";
		result += super.toString();
		
		return result;
	}

}//End of Customer class