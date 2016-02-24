package request;

import java.util.Date;
import java.util.List;

public class SupplyRequest implements Request {

	private String id;
	private Date timeStamp;
	private List<domain.Product> products;

	public SupplyRequest(String id, Date timeStamp, List products) {
		this.id = id;
		this.timeStamp = timeStamp;
		this.products = products;
		//domain.Warehouse + products
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public Date getTimestamp() {
		return this.timeStamp;
	}



	
}
