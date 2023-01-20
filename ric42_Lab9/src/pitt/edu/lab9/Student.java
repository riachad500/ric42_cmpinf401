package pitt.edu.lab9;

public class Student extends Person {
	
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super.setName(name);
		super.setAddress(address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
		
	}
	public int getYear() {
		return year;	
	}
	
	public void setYear(int year) {
		this.year = year;	
	}
	@Override
	public String toString() {
	        String responses = "";
	        
	        responses += "\nName: " + super.getName();
	        responses += "\nAddress: " + super.getAddress();
	        responses += "\nProgram: " + program;
	        responses += "\nYear: " + year;
	        responses += "\nFee: " + fee;
	    	return responses;
	}
}
