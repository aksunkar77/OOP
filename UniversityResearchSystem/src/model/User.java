package model;

public class User {
	private String firstName;

    public User(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    @Override
    public String toString() {
        return firstName;
    }

	public String getLastName() {
	
		return null;
	}
}
