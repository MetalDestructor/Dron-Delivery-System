package request;

import java.util.ArrayList;
import java.util.List;

//log all requests
public class Information {

	List<String> information;
	
	public Information() {
		information=new ArrayList<>();
	}
	
	void addInfo(String info){
		information.add(info);
	}
	
	//TODO get info from date
	
	//get all logs
	void getInfo(){
		for(String str:information){
			System.out.println(str);
		}
	}
}
