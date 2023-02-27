/**
 * Employee class that extends the Person class.
*/
public class Employee extends Person {

	//declare private string variables
	private String employeeId, clockedIn, hiredDate;
	
	/**
	 * Creates Employee constructor.
	* @param firstName The first name of an employee.
	* @param lastName The last name of an employee.
	* @param address The street address of an employee.
	* @param phoneNumber The phone number of an employee.
	* @param email The email of an employee.
	* @param employeeId The employee ID of an employee.
	* @param clockedIn The time that an employee clocked in.
	* @param hiredData The date an employee was hired.
	* @return Initialized parameters.
	*/
	public Employee(String firstName, String lastName, String address, String phoneNumber, String email,  String employeeId, String clockedIn, String hiredDate) {
		super(firstName, lastName, address, phoneNumber, email);
		this.employeeId = employeeId;
		this.clockedIn = clockedIn;
		this.hiredDate = hiredDate;
	}
	
	/**
	 * Gets Employee data for log file.
	* @return Employee data for log file.
	*/
	public String getInfo() {
		return "Employee Info: Employee Name: "+getLastName() +","+getFirstName()+"	"+"Employee ID: "+employeeId +"	"+"Time Clocked In: "+clockedIn;
		
	}
	
	/**
	 * Gets Employee data for data file.
	* @return Employee data for data file.
	*/
	public String getFileData() {
		return employeeId + "," + getFirstName() + "," + getLastName() + "," + clockedIn;
		
	}
	
}
