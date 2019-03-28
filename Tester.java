
public class Tester {

	
	public static void main(String[] args) {

		Catalog c = new Catalog(); 
		Application a1 = new Application(); 
		Application a2 = new Application(); 
		c.applications.add(a1);
		c.applications.add(a2); 
		
		c.applications.get(1).setAppID(2);
		c.applications.get(1).setName("testName2");
		c.applications.get(1).addVersion("0.8.7.1");
		c.applications.get(1).addRating(3);
		c.applications.get(1).addSpecification("testSpec3");
		c.applications.get(1).addGenre("rpg");
		c.display();
	}

}
