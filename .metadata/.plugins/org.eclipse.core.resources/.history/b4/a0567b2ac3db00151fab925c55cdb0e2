package managers;

import java.util.ArrayList;
import java.util.List;

import domain.Drone;

public class DroneManager {

	List<Drone> drones;
	
	DroneManager(){
	}
	
	public void loadDrones(){
		drones=new ArrayList<>();
		for(int i=0; i<50;i++){
			drones.add(new Drone(2000,5,500));
		}
		for(int i=0; i<30;i++){
			drones.add(new Drone(1200,3,200));
		}
	}
	
	public void addDrone(Drone drone){
		drones.add(drone);
	}
	
	public void deleteDrone(Drone drone){
		drones.remove(drone);
	}
}
