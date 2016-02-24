package domain;

public class Location {
	private double x;
	private double y;
	
	public Location(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj){
		try{
			Location location = (Location)obj;
			if (this.x == location.x && this.y == location.y) {
				return true;
			}
			return false;
		}catch(Exception e){
			e.getMessage();
		}
		return false;
	}
	
	@Override
	public String toString(){
		return this.x + "/" + this.y;
	}
}
