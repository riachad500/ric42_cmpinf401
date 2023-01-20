package pitt.edu.lab9;

public class Staff extends Person {

    private String school;
    private double pay;

    public Staff(String name, String address, double pay) {
    	super.setName(name);
		super.setAddress(address);
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        String responses = "";
        
        responses += "\nName: " + super.getName();
        responses += "\nAddress: " + super.getAddress();
        responses += "\nAddress: " + super.getAddress();
        responses += "\nAddress: " + super.getAddress();
    	return responses;
    }
}


