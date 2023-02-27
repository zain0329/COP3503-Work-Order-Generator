/**
 * Ticket class that implements DataHandler Interface. 
*/
public class Ticket implements DataHandler {

	//declare private variables
	private Customer customer;
	private String createdAt, ticketId;
	
	/**
	 * Creates Ticket constructor.
	* @param customer The customer.
	* @param createdAt The time the ticket was created.
	* @param ticketId The Id of the individual ticket.
	* @return Initialized parameters.
	*/
	public Ticket(Customer customer, String createdAt, String ticketId) {
		this.customer = customer;
		this.createdAt = createdAt;
		this.ticketId = ticketId;
	}
	
	/**
	 * Gets Ticket data for log file.
	* @return Ticket data for log file.
	*/
	public String getInfo() {
		return customer.getInfo() + "	Created At: "+createdAt + "	Ticket Id: "+ticketId;
		
	}
	
	/**
	 * Gets Ticket data for data file.
	* @return Ticket data for data file.
	*/
	public String getFileData() {
		return customer.getFileData() + "," + ticketId + "," + createdAt;
	}
}
