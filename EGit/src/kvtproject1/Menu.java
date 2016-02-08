package kvtproject1;

//Class that defines the menu
public class Menu {
	private Product menuItems[];
	
	//Menu Class Constructor
	public Menu(){
		menuItems = new Product[9];
		
		Product book;
		book = new Product("BK100", "Book", "Java", 12.99);
		menuItems[0] = book;
		book = new Product("BK200", "Book", "VB", 16.99);
		menuItems[1] = book;
		book = new Product("BK300", "Book", "PHP", 15.99);
		menuItems[2] = book;
			
		Product CD;
		CD = new Product("CD100", "CD", "TOP 10", 20.99);
		menuItems[3] = CD;
		CD = new Product("CD200", "CD", "TOP 20", 22.99);
		menuItems[4] = CD;
		CD = new Product("CD300", "CD", "TOP 100", 24.99);
		menuItems[5] = CD;
		
		Product game;
		game = new Product("GM100", "Game", "Halo 1", 40.99);
		menuItems[6] = game;
		game = new Product("GM200", "Game", "Halo 2", 42.99);
		menuItems[7] = game;
		game = new Product("GM200", "Game", "Halo 3", 44.99);
		menuItems[8] = game;	
	}
	
	//Method to return a product menu array
	public Product[] getMenu(){
		return menuItems;
	}
	
	//Method to return an array of descriptions
	public String[] getMenuDescriptions(){
		String menuDescription[] = new String[menuItems.length];

		//TODO
		//FILL THE ARRAY menuDescription with the descriptions of the menu items
		menuDescription[0] = "Java";
		menuDescription[1] = "VB";
		menuDescription[2] = "PHP";
		menuDescription[3] = "TOP 10";
		menuDescription[4] = "TOP 20";
		menuDescription[5] = "TOP 100";
		menuDescription[6] = "Halo 1";
		menuDescription[7] = "Halo 2";
		menuDescription[8] = "Halo 3";
		
		//Return the menuDescription back to the calling method
		return menuDescription;	
	}
	
}//End Menu Class