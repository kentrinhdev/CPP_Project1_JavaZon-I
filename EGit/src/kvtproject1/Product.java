package kvtproject1;

//Class that defines a generic product
public class Product {
	private String sku;
	private String type;
	private String description;
	private double price;
	
	//Constructor
	public Product(String aSku, String aType, String aDesc, double aPrice){
		//TODO
		//COPY VARIABLES TO LOCAL CLASS VARIABLES
        this.sku = aSku;
        this.type = aType;
        this.description = aDesc;
        this.price = aPrice;
	}

	//Method to return the sku
	public String getSku() {
		return sku;
	}
	//Method to set the sku
	public void setSku(String sku) {
		this.sku = sku;
	}
	//--------------------------------------------------------
	//Method to return the type
	public String getType() {
		return type;
	}
	//Method to set the type
	public void setType(String type) {
		this.type = type;
	}
	//--------------------------------------------------------
	//Method to return the description
	public String getDescription() {
		return description;
	}
	//Method to set the description
	public void setDescription(String description) {
		this.description = description;
	}
	//--------------------------------------------------------
	//Method to return the price
	public double getPrice() {
		return price;
	}
	//Method to set the price
	public void setPrice(double price) {
		this.price = price;
	}

}//End of Product class