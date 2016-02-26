package domain;

public class Product {

	private String productName;
	private double productWeight;
	
	Product(String product, double d){
		setProductName(product);
		setProductWeight(d);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(double d) {
		this.productWeight = d;
	}
	
	
}
