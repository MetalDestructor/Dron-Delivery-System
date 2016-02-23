package domain;

import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class Battery {

	private String id;
	private int batteryCapacity;
	private int batteryLevel;
	//batteryLevel + for min
	private int chargingRate;
	private int dischargingRate;
	

	public Battery(int batteryCapacity,int batteryLevel, int chargingRate,int dischargingRate){
		this.id=UUID.randomUUID().toString();
		setBatteryCapacity(batteryCapacity);
		setBatteryLevel(batteryLevel);
		setChargingRate(chargingRate);
		setDischargingRate(dischargingRate);
	}
	
	
	public String getId() {
		return id;
	}
	public int getBatteryLevel() {
		return batteryLevel;
	}
	public void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}
	public int getChargingRate() {
		return chargingRate;
	}
	
	public void setChargingRate(int chargingRate) {
		this.chargingRate = chargingRate;
	}
	
	public int getDischargingRate() {
		return dischargingRate;
	}

	public void setDischargingRate(int dischargingRate) {
		this.dischargingRate = dischargingRate;
	}
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
    public void charge(){
    	Timer timer=new Timer();
    	while(this.getBatteryLevel()<this.getBatteryCapacity()){
    		timer.schedule( new TimerTask() {
    		    public void run() {
    		       setBatteryLevel(batteryLevel+chargingRate);
    		    }
    		 }, 0, 60*1000);
    	}
	}

    public void use(){
    	Timer timer=new Timer();
    	while(this.getBatteryLevel()>0){
    		timer.schedule( new TimerTask() {
    		    public void run() {
    		       setBatteryLevel(batteryLevel-dischargingRate);
    		    }
    		 }, 0, 60*1000);
    	}
    	
    }
    
    @Override
    public int hashCode(){
		return id.hashCode();
	}
    @Override
	public boolean equals(Object obj){
    	 if (obj == null) {
    	        return false;
    	    }
    	    if (!Battery.class.isAssignableFrom(obj.getClass())) {
    	        return false;
    	    }
    	    final Battery other = (Battery) obj;
    	    
    	    if (this.id != other.id) {
    	        return false;
    	    }
    	    return true;
    }
    @Override
	public String toString(){
    	StringBuilder builder = new StringBuilder();
    	builder.append("Battery [ ");
    	builder.append(" batteryID " + getId());
    	builder.append(",  batteryCapacity " + getBatteryCapacity());
    	builder.append(", batteryLevel" + getBatteryLevel());
    	builder.append(" ]");
    	return builder.toString();
    }
}
