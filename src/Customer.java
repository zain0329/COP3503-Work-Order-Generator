/**
 * Customer class that extends the Person class. 
*/
public class Customer extends Person {

	//declare private string variables
	private String customerId, accountNumber;
	
	/**
	 * Creates Customer constructor.
	* @param firstName The first name of a customer.
	* @param lastName The last name of a customer.
	* @param address The street address of a customer.
	* @param phoneNumber The phone number of a customer.
	* @param email The email address of a customer.
	* @param customerId The customer ID of a customer.
	* @param accountNumber The account number of a customer.
	* @return Initialized parameters.
	*/
	public Customer(String firstName, String lastName, String address, String phoneNumber, String email, String customerId, String accountNumber) {
		super(firstName, lastName, address, phoneNumber, email);
		this.customerId = customerId;
		this.accountNumber = accountNumber;
	}
	
	/**
	 * Gets Customer data for log file.
	* @return Customer data for log file.
	*/
	public String getInfo() {
		return "	Customer Info: Customer Name: "+getLastName()+","+getFirstName()+"	Customer ID: "+customerId+"	Account Number: "+accountNumber;
		
	}
	
	/**
	 * Gets Customer data for data file.
	* @return Customer data for data file.
	*/
	public String getFileData() {
		return customerId + "," +  getFirstName() + "," + getLastName();
		
	}
}
