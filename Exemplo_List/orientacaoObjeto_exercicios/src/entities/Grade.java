package entities;

public class Grade {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double sumGrades() {
		return n1 + n2 + n3; 
	}
	
	public double missingPoints() {
			return 60.0 - sumGrades();
		
		
	}

}
