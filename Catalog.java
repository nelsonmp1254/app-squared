import java.util.ArrayList;
import java.util.Iterator;


public class Catalog {


	ArrayList<Application> applications = new ArrayList<>(); 

	public Catalog() {
		// TODO Auto-generated constructor stub
	}


	public void display() {
		for(Application a : applications) {
			System.out.println(a);
		}
	}



	public boolean addApp(Application a) {
		//		applications.add(a);
		if(applications.size() == 0) {
			applications.add(a);
			return true;
		}
		else {
			for(int i = 0; i < applications.size(); i++) {
				if(applications.get(i).name.compareTo(a.name) > 0 ) {
					applications.add(i, a);
					return true;
				}
			}
		}
		if(applications.size() > 0) {
			applications.add(a); 
			return true;
		}
		
		return false;
	}

}
