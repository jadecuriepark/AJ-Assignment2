import java.text.DecimalFormat;

public class SalariedEmployee extends Employee {
	
	
	// attributes
	private int salary;
	private int bonus;
	
	// constructors
	public SalariedEmployee() {
		super();
		salary = 0;
		bonus = 0;	
	}
		
	public SalariedEmployee(String jobTitle, String fullName, String hireDate, int salary, int bonus) {
		super(jobTitle, fullName, hireDate);
		this.salary = salary;
		this.bonus = bonus;
	}

	// getters and setters
	public int getSalary() {
		return salary;
	}
		   
	public void setSalary(int salary) {
		this.salary = salary;
	}
			
	public int getBonus() {
		return bonus;
	}
		   
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	// toString method
	public String toString() {
		String str = "";
		str += super.toString();
	    str += "Salaried Employee. Last paycheck: $";
	    str += paycheckGross();
		return str;
	}
	
	// paycheckGross()
	public String paycheckGross() {
		DecimalFormat df = new DecimalFormat(".00");
		int calculation = salary / 26;
		df.format(calculation); // decimal format
		String output = String.valueOf(calculation); // converts int to String
		return output;
	}
	
	
}
