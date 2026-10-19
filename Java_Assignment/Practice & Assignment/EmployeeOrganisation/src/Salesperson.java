public class Salesperson extends Employee {
	protected double commission;
    
    public Salesperson(String name, String address, int age, boolean gender, float basicSalary,double commission) {
    	super(name,address,age,gender,basicSalary);
        this.commission = commission;
    }
    public double getCommission() {
        return commission;
    }
    public void setCommission(double commission) {
        this.commission = commission;
    }
}