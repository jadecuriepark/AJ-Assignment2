import java.text.DecimalFormat;

public class HourlyEmployee extends Employee {
	
	
	// attributes
	private int hourlyRate;
	private int hoursPerPeriod;
	
	// constructors
	public HourlyEmployee() {
		super();
		hourlyRate = 0;
		hoursPerPeriod = 0;
		
	}
	
	public HourlyEmployee(String jobTitle, String fullName, String hireDate, int rate, int hours) {
		super(jobTitle, fullName, hireDate);
		hourlyRate = rate;
		hoursPerPeriod = hours;
	}
	
	// getters and setters
	public int getHourlyRate() {
		return hourlyRate;
	}
	   
	public void setHourlyRate(int rate) {
		hourlyRate = rate;
	}
		
	public int getHoursPerPeriod() {
		return hoursPerPeriod;
	}
	   
	public void setHoursPerPeriod(int hours) {
		hoursPerPeriod = hours;
	}
	
	// toString method
	public String toString() {
		String str = "";
		str += super.toString();
	    str += "Hourly Employee. Last paycheck: $";
	    str += paycheckGross();
		return str;
	}
	
	
	// paycheckGross()
	public String paycheckGross() {
		DecimalFormat df = new DecimalFormat(".00");
		
		int calculation = hourlyRate * hoursPerPeriod;
		df.format(calculation); // decimal format
		String output = String.valueOf(calculation); // converts int to String
		return output;
	}
	
	
	
}
