package edu.northeastern.csye6200;

public class LAB5P3 {

    public static void main(String[] args) {
    	// TODO: write your code here
    	Product milk = new Product("Milk", 3.7);
        Product bread = new Product("Bread", 2.25);
        Product eggs = new Product("Eggs", 4.3);
        
        System.out.println("Creating the below products");
        System.out.println(milk.toString());
        System.out.println(bread.toString());
        System.out.println(eggs.toString());

        System.out.println();
        
        Cart cart = new Cart();
		System.out.println("Adding Milk and Eggs to Cart");
		cart.addProduct(milk);
        cart.addProduct(eggs);
        System.out.println(cart);
        System.out.println("Total Cart Value: $" + cart.getCartTotal());

        System.out.println();
        
        Double payment = 10.0;
        System.out.println("Customer payment: $" + payment);
        System.out.println("Total Change: $" + cart.calculateChange(payment));
    }

}