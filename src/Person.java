/**
 * Person class that implements the DataHandler Interface.
*/
public class Person implements DataHandler {

	//declare private string variables
	private String firstName, lastName, address, phoneNumber, email;
	
	/**
	 * Creates Person constructor.
	* @param firstName The first name of a person.
	* @param lastName The last name of a person.
	* @param address The street address of a person.
	* @param phoneNumber The phone number of a person.
	* @param email The email of a person.
	* @return Initialized parameters.
	*/
	public Person(String firstName, String lastName, String address, String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	/**
	 * Creates method to get work order data for log file
	* @return empty string.
	*/
	public String getInfo() {
		return "";
		
	}
	
	/**
	 * Creates method to get work order data for workOrderData file
	* @return empty string.
	*/
	public String getFileData() {
		return "";
	}

	/**
	 * getter method for address.
	* @return The street address of the person.
	*/
	public String getAddress() {
		return address;
	}

	/**
	 * setter method for address.
	* @return The street address of the person.
	*/
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * getter method for phone number.
	* @return The phone number of the person.
	*/
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * setter method for phone number.
	* @return The phone number of the person.
	*/
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * getter method for last name.
	* @return The last name of the person.
	*/
	public String getLastName() {
		return lastName;
	}

	/**
	 * setter method for last name.
	* @return The last name of the person.
	*/
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * getter method for first name.
	* @return The first name of the person.
	*/
	public String getFirstName() {
		return firstName;
	}

	/**
	 * setter method for first name.
	* @return The first name of the person.
	*/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * getter method for email.
	* @return The email address of the person.
	*/
	public String getEmail() {
		return email;
	}

	/**
	 * getter method for email.
	* @return The email address of the person.
	*/
	public void setEmail(String email) {
		this.email = email;
	}
	
}
