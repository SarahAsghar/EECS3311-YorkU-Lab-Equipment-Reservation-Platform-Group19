package model.User;

public enum UserType {

	STUDENT("Student", 10.0),
	
	FACULTY("Faculty", 15.0),
	
	RESEARCHER("Researcher", 20.0),
	
	GUEST("Guest", 30.0);
	
	String type;
	double hourlyFee;
	
	UserType(String t, double fee){
		type = t;
		hourlyFee = fee;
	}
	
	public String getType() {
		return type;
	}
	
	public double getHourlyFee() {
		return hourlyFee;
	}
	
}
