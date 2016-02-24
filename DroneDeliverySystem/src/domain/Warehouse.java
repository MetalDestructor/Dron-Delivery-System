package domain;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
	private Location location;
	private List<Product> products; //map
	
	public Warehouse(Location location /*, List products*/){
		this.location = location;
		this.products = products;
		//products=new ArrayList<>(); => map 
	}
	
	public void loadProducts(){}
	public void addProduct(){}
	
	
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
