package model.User;

public class User {

	private String email;
	private String password;
	private UserType userType;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String e) {
		this.email = e;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String p) {
		this.password = p;
	}
	
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType t) {
		this.userType = t;
	}
}
