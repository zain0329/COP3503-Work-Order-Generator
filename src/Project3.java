/*
* Author: Zain Malik
* Course: COP3503
* Project #: 3
* Title : Work Order Generator
* Due Date: 11/23/2022
*
* Generates Work Orders.
*/
import java.util.ArrayList;
import java.util.Date;
/**
 * Generates Work Orders.
*/
public class Project3 {

	//declare public string variables
	public static String employeeFileName = "employee_data.csv";
	public static String ticketFileName = "ticket_data.csv";
	public static String workOrderFileName = "workorder_data.csv";
	
	//declare public Array List variables
	public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	public static ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
	public static ArrayList<WorkOrder> workOrderList = new ArrayList<WorkOrder>();
	
	public static void main(String[] args) {
		
		//Display the project title followed by a blank line
		System.out.println("Project 3 Work Order Generator");
		System.out.println();
		
		//create new FileHandler
		FileHandler fileHandler = new FileHandler();
		
		//create log string and give it correct name
		String log = "log.txt";
		
		//call readEmployeeData method
		fileHandler.readEmployeeData(employeeFileName);
		
		//call readTicketData method
		fileHandler.readTicketData(ticketFileName);
		
		//call createWorkOrders method
		createWorkOrders();
		
		//call logger method
		fileHandler.logger(log);
		
		//call writeData method
		fileHandler.writeData(workOrderFileName);

	}
	
	/**
	 * Creates Work Orders.
	* @return Work Orders created for each ticket.
	*/
	public static void createWorkOrders() {
		
		//declare integer variables
		int counter = ticketList.size() / employeeList.size();
		int index = 0;
		
		//for loop that iterates over the list of Tickets and Employees to create WorkOrders for each Ticket
		for ( Employee employee : employeeList ){	
			for(int i = 0; i < counter; i++) {
				if(ticketList.size() > i+index) {
					WorkOrder workorder = new WorkOrder(employee, ticketList.get(i+index), new Date().toString());
					workOrderList.add(workorder);
					index +=counter;
				}
				
			}
		}
	}

}
