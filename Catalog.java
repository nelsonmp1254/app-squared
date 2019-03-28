import java.util.ArrayList;

public class Catalog {

	
	ArrayList<Application> applications = new ArrayList<>(); 
	
	public Catalog() {
		// TODO Auto-generated constructor stub
	}

	
	public void display() {
		for(Application a : applications)
			System.out.println(a);
	}
}
