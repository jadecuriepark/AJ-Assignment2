
public class Employee {

	
	// attributes
	private String jobTitle;
	private String fullName;
	private String hireDate;
	
	// constructors
	public Employee() {
		jobTitle = "";
		fullName = "";
		hireDate = "";
	}
	
	public Employee(String title, String name, String date) {
		jobTitle = title;
		fullName = name;
		hireDate = date;
	}
	
	// getters and setters
	public String getJobTitle() {
		return jobTitle;
	}
   
	public void setJobTitle(String title) {
		jobTitle = title;
	}
	
	public String getFullName() {
		return fullName;
	}
   
	public void setFullName(String name) {
		fullName = name;
	}
	
	public String getHireDate() {
		return hireDate;
	}
   
	public void setHireDate(String date) {
		hireDate = date;
	}
	
	// methods
	public String toString() {
		String str = "";
	    str += fullName + " - ";
	    str += jobTitle + ", ";
		return str;
	}
	
	public String paycheckGross() {
		String str = "";
	    str += "Unable to calculate paycheck for base Employee!";
		return str;
	}
	
	
}
