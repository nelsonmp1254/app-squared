import java.awt.Image;
import java.util.ArrayList;

public class Application {

	public int appID; 
	public String name, developer; 
	public boolean pending; 
	ArrayList<Image> screenshots; 
	ArrayList<String> versions, genres, specifications; 
	ArrayList<Integer> ratings; 
	
	
	public Application() {
		setAppID(1); 
		setName("testName"); 
		setDeveloper("testDev"); 
		setPending(true); 
		setScreenshots(new ArrayList<Image>()); 
		setVersions(new ArrayList<String>()); 
		setGenres(new ArrayList<String>()); 
		setSpecifications(new ArrayList<String>()); 
		setRatings(new ArrayList<Integer>()); 
	}
	
	public Application(int appID, String name, String developer, boolean pending,
				ArrayList<Image> screenshots, ArrayList<String> versions, ArrayList<String> genres, 
				ArrayList<String> specifications, ArrayList<Integer> ratings) 
	{
		setAppID(appID); 
		setName(name); 
		setDeveloper(developer); 
		setPending(pending); 
		setScreenshots(screenshots); 
		setVersions(versions); 
		setGenres(genres); 
		setSpecifications(specifications); 
		setRatings(ratings); 
		
	}
	
	// -------------------------- Methods --------------------------


	@Override
	public String toString() {
		return "Application [ appID : " + appID + ", name : " + name + ", developer : " + developer + ", pending : " + pending
				+ ", screenshots : " + screenshots + ", versions : " + versions + ", genres : " + genres + ", specifications : "
				+ specifications + ", ratings : " + ratings + "]";
		
		
	}

	


	
	// --------------------- Getters / Setters ---------------------

	public void setAppID(int appID) {	this.appID = appID;	}
	

	public void setName(String name) {	this.name = name;	}
	public void setDeveloper(String developer) {	this.developer = developer;	}
	public void setScreenshots(ArrayList<Image> screenshots) {	this.screenshots = screenshots;	}
	public void setVersions(ArrayList<String> versions) {	this.versions = versions;	}
	public void setGenres(ArrayList<String> genres) {	this.genres = genres;	}
	public void setSpecifications(ArrayList<String> specifications) {	this.specifications = specifications;	}
	public void setRatings(ArrayList<Integer> ratings) {	this.ratings = ratings;	}
	public void setPending(boolean pending) {	this.pending = pending;	}
	
	public void addRating(int rating) { ratings.add(rating); }
	public void addScreenshot( Image screenshot) { screenshots.add(screenshot); }
	public void addVersion (String version) { versions.add(version); } 
	public void addGenre (String genre) { genres.add(genre); }
	public void addSpecification(String specification) {specifications.add(specification); }
	
	
	
	public int getAppID() {	return appID;	}
	public String getName() {	return name;	}
	public String getDeveloper() {	return developer;	}
	public ArrayList<Image> getScreenshots() {	return screenshots;	}
	public ArrayList<String> getVersions() {	return versions;	}
	public ArrayList<String> getGenres() {	return genres;	}
	public ArrayList<String> getSpecifications() {	return specifications;	}
	public ArrayList<Integer> getRatings() {	return ratings;	}
	
	public boolean isPending() {	return pending;	}




	
	
	
	
}
