package models;

public class User {

	private String firstName;
	private String lastName;	
	private String eMmail;
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	public void setName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMmail() {
		return eMmail;
	}
	public void seteMmail(String eMmail) {
		this.eMmail = eMmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
