package model.User;

public class User {

	private String email;
	private String password;
	private UserType userType;
	private boolean status;
	private String name;
	private String idNum;
	
	public User(String email, String password, UserType t, String idNum, String name) {
		this.email = email;
		this.password = password;
		this.userType = t;
		this.idNum = idNum;
		this.name = name;
		this.status = (t == UserType.GUEST);
	}
	
	public String getIDNum() {
		return idNum;
	}
	public void setIDNum(String num) {
		this.idNum = num;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
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
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
