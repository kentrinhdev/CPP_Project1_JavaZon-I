package kvtproject1;
//Import Java text formatting
import java.text.NumberFormat;
import java.util.Arrays;

//Class that defines an order
public class Order {
	//Declare class variables
	private Customer orderCustomer;
	private Clerk orderClerk;
	private Product[] orderProduct;
	private int[] orderQuantity;
	
	//Declare class variables to store totals
	private double subtotal;
	private double tax;
	private double total;
	
	//Define constant rate for tax
	private static double TAX_RATE = 0.0825;

	//Keep track of how many products were added
	private int productCount;
	
	//Constructor
	public Order(){
		orderProduct = new Product[1];
		orderQuantity = new int[1];
	}
	
	//Setter to assign customer
	public void setOrderCustomer(Customer aCustomer){
		orderCustomer = aCustomer;
	}
	
	//Setter to assign clerk
	public void setOrderClerk(Clerk aClerk){
		orderClerk = aClerk;
	}
	
	public void setOrderProduct(Product aProduct, int aQty){
		//TODO
		//EACH TIME A USER ADDS A PRODUCT TO THE ORDER
		//IF IT IS THE FIRST PRODUCT ADDED TO THE ORDER THEN
		//STORE IT IN THE orderProduct ARRAY
		//IF MORE PRODUCTS ARE ADDED, YOU HAVE TO RESIZE THE 
		//orderProduct and orderQuantity arrays.
		//the way to do that is to the the Arrays.copyOf method or
		//to create temp array for each
		//copy the current arrays into temp arrays
		//resize the current arrays
		//put back the temp arrays in the current arrays
		//in the newly sized arrays
		//add the new product
		//add the quantity		    
		if (productCount == 0){
			this.orderProduct[productCount] = aProduct; 
			this.orderQuantity[productCount] = aQty;
		} 
			else{ 
					Product[] tempProduct;
					int[] tempQuantity;
					tempProduct = Arrays.copyOf(orderProduct, orderProduct.length + 1);
					tempQuantity = Arrays.copyOf(orderQuantity, orderQuantity.length + 1);
					orderProduct = tempProduct;
					orderQuantity = tempQuantity;
					orderProduct[productCount] = aProduct;
					orderQuantity[productCount] = aQty;
				}
				productCount++;
	}
		
	public double calcSubtotal(){
		//TODO
		//FOR LOOP THROUGH THE orderProduct array
		//get the price
		//get the quantity from the orderQuantity array
		//STORE IT IN subtotal VARIABLE
		double sum = 0;
		for(int i = 0; i < orderProduct.length; i++){
			sum += orderProduct[i].getPrice()*orderQuantity[i];	
			subtotal = sum;
		}
		return subtotal;	
	}
	
	public double calcTax(){
		//TODO
		//CALCULATE THE TAX
		//STORE IT IN TAX VARIABLE
		tax = 0;
		tax = calcSubtotal() * TAX_RATE;
		
		return tax;
	}
	
	public double calcTotal(){
		//TODO
		//CALCULATE THE TOTAL
		//STORE IT IN TOTAL VARIABLE
		total = 0;
		total = calcSubtotal() + calcTax();
		
		return total;
	}

	//Returns the number of items sold
	public int getNumberItemsSold(){
		int totalQty = 0;
		for (int i = 0;i<orderQuantity.length;i++){
			totalQty += orderQuantity[i];
		}
		return totalQty;
	}
	
	public String toString(){
		NumberFormat nf =  NumberFormat.getCurrencyInstance();
		
		String result = "";
		//TODO
		//ADD REST OF SUMMARY TO RESULT
		//SEE PROJECT HANDOUT TO GET IDEA OF HOW YOUR SUMMARY SHOULD LOOK LIKE
		//THIS LINE IS AN EXAMPLE OF HOW TO GET INFORMATION FROM
		//OTHER OBJECTS THAT ARE AVAILABLE WITHIN THE ORDER CLASS
		//-------------------------------------------------------------------------------------------------
		//	Cashier Information
		//-------------------------------------------------------------------------------------------------	
		result += "CASHIER @ REGISTER\n " + orderClerk.getFirstName() + " " + orderClerk.getLastName() + " @ " + orderClerk.getRegisterNbr() + "\n\n";
		//-------------------------------------------------------------------------------------------------
		//	Customer Information
		//-------------------------------------------------------------------------------------------------	
		result += "CUSTOMER INFORMATION\n" + orderCustomer.toString() + "\n";
		//-------------------------------------------------------------------------------------------------
		//	Itemized list of all items purchased
		//-------------------------------------------------------------------------------------------------	
		result += "NUMBER OF ITEMS SOLD = " + getNumberItemsSold() + "\n";
		//get the line item summary for each item
		//get the line item total for each item
		for (int i = 0; i < orderProduct.length; i++){
			result += orderQuantity[i] + " @ " + nf.format(orderProduct[i].getPrice()) + " = " + nf.format(orderQuantity[i] * orderProduct[i].getPrice()) + "\n";
			result += " " + orderProduct[i].getDescription()+ "\n\n";
		}
		//-------------------------------------------------------------------------------------------------
		//	TOTALS for the Compiled Receipt
		//-------------------------------------------------------------------------------------------------	
		//Generate the grand Subtotal, grand Tax, and grand Total for the final Receipt
		result += "TOTALS\n";
		result += "\t\t\tSubtotal = " + nf.format(calcSubtotal()) + "\n";
		result += "\t\t\tTax = " + nf.format(calcTax()) + "\n";
		result += "\t\t\tTotal = " + nf.format(calcTotal()) + "\n";
		
		return result;
	} 

}//End of Order class