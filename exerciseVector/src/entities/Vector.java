package entities;

public class Vector {
	
	private String name;
	private String email;
	private int numberBedroom;
	
	public Vector(String name, String email, int numberBedroom) {
		this.name = name;
		this.email = email;
		this.numberBedroom = numberBedroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumberBedroom() {
		return numberBedroom;
	}
	public void setNumberBedroom(int numberBedroom) {
		this.numberBedroom = numberBedroom;
	}
	
	public String toString() {
		return numberBedroom + ": " + name + ", " + email;
	}

}
