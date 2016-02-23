package managers;


import request.Request;

public class RequestManager {

	//TODO WarehouseManager
	private WarehouseManager wm;
	
	
	//? not sure its necessary
	public RequestManager(WarehouseManager wm){
		this.wm=wm;
	}
	//TODO DeliveryRequest
	public void run(DeliveryRequest dr){
		
	}
	//TODO SupplyRequest
	public void run(SupplyRequest sr){}
}
