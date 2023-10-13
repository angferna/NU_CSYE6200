package edu.northeastern.csye6200;

public class Cart {
	// TODO: write your code here
	//StringBuilder products; //list of all the items in the cart separated by comma
	String products;
	Double cartTotal; //total cart value

    public Cart() { //A default (no-arg) constructor that creates a Cart object with default values (“” for products and 0.0 for cartTotal)
    	// TODO: write your code here
    	products = "";
    	cartTotal = 0.0;
    }
 
    public double getCartTotal() { //returns the cartTotal attribute
    	// TODO: write your code here
    	return cartTotal;
    }
    
    public void addProduct(Product product) { //add the new item to the cart
    	// TODO: write your code here
    	if (products.length() > 0) {
            products += ", ";
        }
    	products += "\"" + product.getItemName() + "\"";
        cartTotal += product.getPrice();
    }
    
    public double calculateChange(double payment) { //returns the change amount after payment
    	// TODO: write your code here
    	return payment - cartTotal;
    }
    
    @Override
    public String toString() { //returns all available items in the Cart as a String, i.e., Cart { “xxxx”, “xxxx”, ... }
    	// TODO: write your code here
    	return "Cart{ " + products + " }";
    }
}
