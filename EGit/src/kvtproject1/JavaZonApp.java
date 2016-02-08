package kvtproject1;
//Import Java GUI
import javax.swing.JOptionPane;

//Class that defines the JavaZon Application
//JavaZonApp handles all of the user-interface code
public class JavaZonApp {

	public static void main(String[] args) {

			//COLLECT INFORMATION USING JOPTIONPANE
			//Do the same for the other variables
			String firstName = Validator.getValidFirstName(JOptionPane.showInputDialog("Enter the First Name: "));
			String lastName = Validator.getValidLastName(JOptionPane.showInputDialog("Enter the Last Name: "));
			String street = Validator.getValidStreet(JOptionPane.showInputDialog("Enter the Street Address: "));
			String city = Validator.getValidCity(JOptionPane.showInputDialog("Enter the City: "));
			String state = Validator.getValidState(JOptionPane.showInputDialog("Enter the State: "));
			String zip = Validator.getValidZip(JOptionPane.showInputDialog("Enter the Zip Code: "));
			String phone = Validator.getValidPhone(JOptionPane.showInputDialog("Enter the Phone Number: "));
			String membership = Validator.getValidMembership(JOptionPane.showInputDialog("Enter the Membership ID: "));
			
			/*
			 * This code is only needed if there is a need to pre-define default values
			 *firstName = firstName;
			 *lastName = lastName;
			 *street = street; 
			 *city = city ;
			 *state = state;
			 *zip = zip;
			 *phone = phone; 
			 *membership = membership;
			*/
			
			//CREATE A NEW CUSTOMER OBJECT (uncomment line below)
			Customer customer = new Customer(firstName,lastName,street,city,state,zip,phone,membership);

			//CREATE NEW ORDER OBJECT
			Order order = new Order();
			
			//SET ORDER CUSTOMER
			order.setOrderCustomer(customer);

			//LOOP TO COLLECT PRODUCTS SELECTED BY USER AND THEIR QUANTITIES
			do {
				//CREATE MENU OBJECT
				Menu menu = new Menu();
				
				//Get the items from the menu class and load them into the JOptionPane menu
				String menuItems[] = menu.getMenuDescriptions();
			
				int intCode = 0;
				intCode = JOptionPane.showOptionDialog(null, "Select an Option",
						"Menu Items", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, menuItems, menuItems[0]);
				
				//RETURN PRODUCT FROM MENU
				Product product = menu.getMenu()[intCode];

				//PROMPT USER TO ENTER QUANTITY
				String qty = Validator.getValidQuantity(JOptionPane.showInputDialog("Enter Quantity"));

				//ADD PRODUCT AND QUANTITY TO ORDER
				order.setOrderProduct(product, Integer.parseInt(qty));

			}while (JOptionPane.showConfirmDialog(null,
					"Enter More Products?",
					"User Selection",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null) != JOptionPane.NO_OPTION);

			//CREATE A NEW JAVAZON STORE
			JavaZon jz = new JavaZon();
			
			//ADD THE ORDER TO THE STORE
			jz.setOrder(order);
			
			//ASSIGN A CLERK TO THE ORDER
			jz.setClerk();
			
			//PROCESS ORDER
			jz.processOrder();
			
			//DISPLAY THE RESULT
			JOptionPane.showMessageDialog(null,jz.getReceipt());
	}

}//End of JavaZonApp class