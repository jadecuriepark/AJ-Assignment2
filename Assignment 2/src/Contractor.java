import java.text.DecimalFormat;

public class Contractor extends Employee {
	
	// attributes
	private int hourlyRate;
	private int hoursPerPeriod;
	private String contractStart;
	private String contractEnd;
	private String company;
	
	// constructors
	public Contractor() {
		super();
		hourlyRate = 0;
		contractStart = null;
		contractEnd = null;
		company = "";
	}
		
	public Contractor(String jobTitle, String fullName, String hireDate, int hourlyRate, String contractStart, String contractEnd, String company) {
		super(jobTitle, fullName, hireDate);
		this.hourlyRate = hourlyRate;
		this.contractStart = contractStart;
		this.contractEnd = contractEnd;
		this.company = company;
	}

	// getters and setters
	public int getHourlyRate() {
		return hourlyRate;
	}
		   
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
			
	public String getContractStart() {
		return contractStart;
	}
		   
	public void setContractStart(String contractStart) {
		this.contractStart = contractStart;
	}
	
	public String getContractEnd() {
		return contractEnd;
	}
		   
	public void setContractEnd(String contractEnd) {
		this.contractEnd = contractEnd;
	}
	
	public String getCompany() {
		return company;
	}
		   
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	// toString method
	public String toString() {
		String str = "";
		str += super.toString();
	    str += "Contractor with " + company;
	    str += ". Last paycheck: $" + paycheckGross();
		return str;
	}
	
	
	// paycheckGross()
	public String paycheckGross() {
		DecimalFormat df = new DecimalFormat(".00");
		
		int calculation = hourlyRate * 80;
		df.format(calculation); // decimal format
		String output = String.valueOf(calculation); // converts int to String
		return output;
	}


}
