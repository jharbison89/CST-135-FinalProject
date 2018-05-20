
public class Dispenser {
	
	/* 
	 * Created by James Harbison and Chase Hausman
	 * This class manages the products in a vending machine and is used to test the product class and its subclasses
	 */
	
	private Product[] products;
	private String name;
	
	
	// creates a default dispenser of size 8
	public Dispenser(){
		products = new Product[8];
		name = "default";
		createRandomDrinkProducts();
	}
	
	// creates a dispenser of specified size
	public Dispenser(int size, String name, String type) {
		products = new Product[size];
		this.name = name;
		if(type.toUpperCase().equals("DRINK")) {
			createRandomDrinkProducts();
		}
		else if(type.toUpperCase().equals("GUM")) {
			createRandomGumProducts();
		}
		else if(type.toUpperCase().equals("CHIP")) {
			createRandomChipProducts();
		}
		else {
			createRandomCandyProducts();
		}
			
	}
	
	// creates drinks with "random" filled properties using the overloaded constructor
	public void createRandomDrinkProducts() {
		for(int i = 0; i < products.length; i ++) {
			products[i] = new Drink("Drink" + i, 1.50, 10 , (int)(Math.random() * 10), 20); 
		}
	}
	
	// creates gums with "random" filled properties using the overloaded constructor
	public void createRandomGumProducts() {
		for(int i = 0; i < products.length; i ++) {
			products[i] = new Gum("Gum" + i, .75, 10 , (int)(Math.random() * 10), "Original", 15, true);
		}
	}
	
	// creates chips with "random" filled properties using the overloaded constructor
	public void createRandomChipProducts() {
		for(int i = 0; i < products.length; i ++) {
			products[i] = new Chips("Chips" + i, 1.25, 10 , (int)(Math.random() * 10), "Original", "Kettle", 12.5);
		}
	}

	// creates chips with "random" filled properties using the overloaded constructor
	public void createRandomCandyProducts() {
		for(int i = 0; i < products.length; i ++) {
			products[i] = new Candy("Candy" + i, .95, 10 , (int)(Math.random() * 10), "Original", true, true, true, true, false);
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// displays a list of each product using each classes toString method
	public void displayProducts() {
		
		for(int i = 0; i < products.length; i ++) {
			System.out.println("Product " + i + "\n" + products[i] + "\n");
		}
		
	}
	
	public int getSize() {
		return products.length;
	}
	
	public int getProductCurrentInventory(int i) {
		return products[i].getCurrentQuantity();
	}
	
	public void setProductCurrentInventory(int i, int quantity) {
		products[i].setCurrentQuantity(quantity);
	}
	
	public String getProductName(int i) {
		return products[i].getName();
	}
	
	public double getProductPrice(int i) {
		return products[i].getPrice();
	}
	
	public int getProductMaxQuantity(int i) {
		return products[i].getMaxQuantity();
	}
	
	public Product getProduct(int i) {
		return products[i];
	}
	
	// returns a list of each product using each classes toString method
	public String toString() {
		String string = "";
		
		for(int i = 0; i < products.length; i ++) {
			string = string + "Product " + i + "\n" + products[i] + "\n\n";
		}
		
		return string;
	}
	

}
