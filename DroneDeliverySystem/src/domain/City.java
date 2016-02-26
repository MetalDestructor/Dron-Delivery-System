package domain;

import java.util.ArrayList;
import java.util.List;

public class City {
	private String name;
	private double x;
	private double y;
	private List<Warehouse> warehouses;

	public City(String name, double x, double y) {
		warehouses=new ArrayList<>();
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public void addWarehouse(Warehouse wh){
		warehouses.add(wh);
	}
	
	public String getName() {
		return this.name;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		try {
			City city = (City) obj;
			if (this.name.equals(city.name) && this.x == city.x && this.y == city.y) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.getMessage();
		}
		return false;
	}

	@Override
	public String toString() {
		return this.name + " is " + this.x + "x" + this.y;
	}

}
