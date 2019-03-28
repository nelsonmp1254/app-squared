
public class User {

	public String name, userID, email; 
	private eUserType userType;
	private String address; 
	private int age; 
	
	public User(String name, String userID, eUserType userType, String address, int age, String email) {
		setName(name); 
		setUserID(userID); 
		setUserType(userType); 
		setAddress(address); 
		setAge(age); 
		setEmail(email); 
	}
	
	// -------------------------- Methods --------------------------
	/* 
	 * For most of the methods listed, I think functionality should be done in other classes. 
	 * User account should only be used to store information about the user
	 * All an account does is allow for posting, which doesn't need to be saved to account 
	 * 			So all it needs, other than login info, is the type of account
	 */
	
	
	/*
	 * Should probably be tied to the client / somewhere with a list of users/passwords (Hashmap or DB)
	 */
	public void signIn() {}
	public void signOut() {}
	
	
	/*
	 * How does a user create an account
	 */
	public void createAccount() {}
	
	/*
	 * Search shouldn't be tied to user, unless we want a search history
	 * Even then, should be in a seperate class independent of user
	 */
	public void search() {} 
	
	/*
	 * ??
	 */
	private void validate() {}
	private void validatePermission() {}
	
	// --------------------- Getters / Setters ---------------------
	public String getName() {					return name;		}
	public String getUserID() {					return userID;		}
	public String getEmail() {					return email;		}
	public String getAddress() {				return address;		}
	public int getAge() {						return age;			}
	public eUserType getUserType() { 			return userType;	}
	
	public void setName(String name) {			this.name = name;	}
	public void setUserID(String userID) {		this.userID = userID;}
	public void setEmail(String email) {		this.email = email; }
	public void setAddress(String address) {	this.address = address;		}
	public void setAge(int age) {				this.age = age;		}
	public void setUserType(eUserType userType) { this.userType = userType;}
	
}
