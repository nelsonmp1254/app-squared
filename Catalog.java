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

	public String stringDisplay(String type, String s) {
		String ret = ""; 
		for(Application a : this.applications) {
			if(type.equalsIgnoreCase("name")) {
				if(a.name.toLowerCase().contains(s.toLowerCase())) {
					ret += a.name + "    " + a.developer + "     " + a.genres.get(0) + "\n";
				}
			}
			else
				if(type.equalsIgnoreCase("developer")) {
					if(a.developer.toLowerCase().contains(s.toLowerCase())) {
						ret += a.name + "    " + a.developer + "     " + a.genres.get(0) + "\n";
					}
				}
				else
					if(type.equalsIgnoreCase("genre")) {
						if(a.genres.get(0).toLowerCase().contains(s.toLowerCase()) ) {
							ret += a.name + "    " + a.developer + "     " + a.genres.get(0) + "\n";
						}
					}
					else if (type.equalsIgnoreCase("")) {
						ret += a.name + "    " + a.developer + "     " + a.genres.get(0) + "\n";
					}
		}
		
		return ret;
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
