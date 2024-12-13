import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

    }
}

class Product{
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

/* modify them
    public void setName(String name) {
        //this.name = name;
    }

    public void setPrice(double price) {
        //this.price = price;
    }

    public void setQuantity(int quantity) {
        //this.quantity = quantity;
    }

 */
    public void displayDetails(){
        System.out.println(name + " - " + price + " - " + quantity);  //display sth
    }
}

class Inventory{
    private Product product1;
    private Product product2;
    private Product product3;
    ArrayList<Product> store = new ArrayList<Product>();
    public void addProduct(Product p){ // add a new product to the inventory. This method should check if space is available for a new product.
        store.add(p);
    }
    public void updateProduct(){ // update the details of an existing product by matching the product's name

    }
    public void displayAllProducts(){ // display all the products in the inventory

    }
}
