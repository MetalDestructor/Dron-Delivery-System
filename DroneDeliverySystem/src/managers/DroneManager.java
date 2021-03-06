package managers;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import domain.Drone;

public class DroneManager {

	//List<Drone> drones;
	TreeMap<Float,Drone> drones;
	
	DroneManager(){
	}
	
	public void loadDrones(){
		new TreeMap<>();
		for(int i=0; i<50;i++){
			Drone drone=new Drone(2000,5,500);
			drones.put(drone.getWeightCapacity(),drone);
		}
		for(int i=0; i<30;i++){
			Drone drone=new Drone(1200,3,200);
			drones.put(drone.getWeightCapacity(),drone);
		}
	}
	
	//TODO DeliveryRequest
	public boolean canCarrry(DeliveryRequest req, Drone drone){
		return req.getProduct().getWeight()<drone.getWeightCapacity();
	}
	
	public ArrayList<Drone> chooseDrone(float weight){
		float w=weight;
		ArrayList<Drone> listOFDrones=new ArrayList<>();
		while(drones.lastKey()<w){
			listOFDrones.add(drones.get(drones.values()));
			w-= drones.lastKey();
		}
		
		
		
		return listOFDrones;
	}
	
	public int searchRightDrone(TreeMap<Float,Drone> dr,int key,int min, int max){
		return 0;
	}
	public void addDrone(Drone drone){
		drones.put(drone.getWeightCapacity(),drone);
	}
	
	public void deleteDrone(Drone drone){
		drones.remove(drone);
	}
}
