import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * WorkOrder class that implements DataHandler Interface. 
*/
public class WorkOrder implements DataHandler{

	//declare private variables
	private Employee employee;
	private Ticket ticket;
	private String createdAt;
	
	/**
	 * Creates WorkOrder constructor.
	* @param employee The employee.
	* @param ticket The ticket.
	* @param createdAt The time the work order was created.
	* @return Initialized parameters.
	*/
	public WorkOrder(Employee employee, Ticket ticket, String createdAt) {
		this.setEmployee(employee);
		this.ticket = ticket;
		this.createdAt = createdAt;
	}
	
	/**
	 * Gets Work Order data for log file.
	* @return Work Order data for log file.
	*/
	public String getInfo() {
		//create new date
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");  
		 Date date = new Date(); 
		 
		 //convert date to string
		 String newDate = formatter.format(date); 
		 
		 //return work order data
		return newDate+" "+employee.getInfo()+ticket.getInfo()+"Workorder Info: 	Created At: "+createdAt+"\n";
		
	}
	
	/**
	 * Gets Work Order data for data file.
	* @return Work order data for data file.
	*/
	public String getFileData() {
        return employee.getFileData() + "," + ticket.getFileData() + "," + createdAt + "\n";
    }
	
	/**
	 * Getter method for employee.
	* @return The employee.
	*/
	public Employee getEmployee() {
		return employee;
	}
	
	/**
	 * Setter method for employee.
	* @return The employee.
	*/
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	/**
	 * Getter method for ticket.
	* @return The ticket.
	*/
	public Ticket getTicket() {
		return ticket;
	}
	
	/**
	 * setter method for ticket.
	* @return The ticket.
	*/
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
}
