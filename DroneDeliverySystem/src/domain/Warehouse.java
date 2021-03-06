package domain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Warehouse {
	private Location location;
	private Map<Product,Integer> products;
	
	public Warehouse(Location location){
		this.location = location;
		products=new HashMap<>();
	}
	
	public void loadProducts(){
		products.put(new Product("showerGel",0.2), 48);
		products.put(new Product("deo",0.15), 16);
	}
	
	
	public void addProduct(Product prod, int amount){
		products.put(prod, amount);
	}
	
	public Product findProduct(String productName){
		
	}
	
	public boolean productIsFound(){
	}
	
	
	
	public Location getLocation(){
		return this.location;
	}
	
	public void setLocation(Location location){
		this.location = location;
	}
	
	@Override
	public String toString(){
		return "Warehouse is at" + location.getX() + " and " + location.getY() + ".";
	}
	
	public String products(){
		return products.toString();
	}
}
