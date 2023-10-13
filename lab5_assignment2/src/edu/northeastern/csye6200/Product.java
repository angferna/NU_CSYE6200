package edu.northeastern.csye6200;

public class Product {
	// TODO: write your code here
	String itemName; //name of the item
	double price; //price of the item

    public Product(String itemName, double price) { //a constructor with parameters itemName, price
    	// TODO: write your code here
    	this.itemName = itemName;
    	this.price = price;
    }

    public String getItemName() { //returns the itemName attribute
    	// TODO: write your code here
    	return itemName;
    }

    public double getPrice() { //returns the itemPrice attribute
    	// TODO: write your code here
    	return price;
    }

    @Override
    public String toString() { //returns itemName and price as a String
    	// TODO: write your code here
    	return "Product{ itemName = \"" + itemName + "\", price = $" + price + " }";
    }
}