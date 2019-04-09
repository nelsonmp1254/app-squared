import java.awt.Graphics;
import java.awt.Image;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;

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

	public Application(String[] s)
	{
		this(Integer.parseInt(s[0].trim()), s[1].trim(), s[2].trim(), Boolean.parseBoolean(s[3].trim()),
				new ArrayList<Image>(), new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>(), new ArrayList<Integer>() );

		ArrayList<String> genres = new ArrayList<>(); 
		
		
		for(String gs : s[4].split(" ")) {
			genres.add(gs);
		}
		
		this.setGenres(genres);
	}

	public Application(String s)
	{
		this(s.split("\t"));
	}

	public Application(RandomAccessFile raf) throws Exception
	{
		this(raf.readLine());
	}

	// -------------------------- Methods --------------------------


	@Override
	public String toString() {
		return "Application [ appID : " + appID + ", name : " + name + ", developer : " + developer + ", pending : " + pending
				+ ", screenshots : " + screenshots + ", versions : " + versions + ", genres : " + genres + ", specifications : "
				+ specifications + ", ratings : " + ratings + "]";



	}


	public int compareTo(Application a) {
		if(this.name.equals(a.getName()))
			return 0; 
		else if(this.name.compareTo(a.getName()) > 1)
			return 1;
		else 
			return -1; 
	}


	public void draw(Graphics g, String sT, String ss, int x, int y) {

		if(sT.equalsIgnoreCase("name")) {
			if(this.name.contains(ss)) {
				g.drawString(this.toString(), x, y);
			}
		}
		else
			if(sT.equalsIgnoreCase("developer")) {
				if(this.developer.contains(ss)) {
					g.drawString(this.toString(), x, y);
				}
			}
			else
				if(sT.equalsIgnoreCase("genre")) {
					if(this.genres.contains(ss) ) {
						g.drawString(this.toString(), x, y);
					}
				}
				else {
					g.drawString(this.toString(), x, y);
				}

		//g.drawString(this.toString(), x, y);

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
