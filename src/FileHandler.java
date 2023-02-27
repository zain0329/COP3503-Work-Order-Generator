import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * Reads in the Employee and Ticket data and writes data out to a WorkOrderData file and a log file.
*/
public class FileHandler {

	//declare scanner
	private Scanner scnr = new Scanner(System.in); 
	
	/**
	 * Iterates over the list of Work Orders and writes out data to Work Order Data file.
	* @param workOrderFileName The file name of the Work Order Data File.
	* @return The file with the work order data.
	*/
	public void writeData(String workOrderFileName) {
		try {
			//creates new File Writer
			FileWriter fw =new FileWriter(workOrderFileName);
			
			//write header to file writer
			fw.write("employee_id,employee_first_name,employee_last_name,clocked_in,customer_id,customer_first_name,customer_last_name,ticket_id,ticket_createdAt,workorder_createdAt \n");
			
			//for loop iterates over the list of work orders
			for(WorkOrder workorder : Project3.workOrderList) {
				//write work order data to file
				String data = workorder.getFileData();
				fw.write(data);
				
			}
			//close file writer
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Reads in data from employee_data file.
	* @param employeeFileName The name of the employee_data file.
	* @return array list with the employee data.
	*/
	public void readEmployeeData(String employeeFileName) {
		try {
			//declare new buffered reader
			BufferedReader br = new BufferedReader(new FileReader(employeeFileName));
			String line = "";
		    String dl = ",";

		    //skip first line to avoid reading header
			  line = br.readLine();
			  String[] reader;
			  while ((line = br.readLine()) != null) {

		    	  reader = line.split(dl);
		    	  
		    	  //read in Employee data
		    	  Employee newEmployee = new Employee(reader[1], reader[2], reader[4], reader[6], reader[3],  reader[0], reader[6], reader[7]);
		    	 
		    	  //add employee data to employeeList array list
		    	  Project3.employeeList.add(newEmployee);
		    	  
			  }
			  //close buffered reader
			  br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Reads in data from ticket_data file.
	* @param employeeFileName The name of the ticket_data file.
	* @return array list with the ticket data.
	*/
	public void readTicketData(String ticketFileName) {
		try {
			//declare buffered reader
			BufferedReader br = new BufferedReader(new FileReader(ticketFileName));
			String line = "";
		      String dl = ",";

		    //skip first line to avoid reading header
			  line = br.readLine();
			  String[] reader;
			  while ((line = br.readLine()) != null) {

		    	  reader = line.split(dl);
		    	  
		    	  //read in customer data
		    	  Customer customer = new Customer(reader[1], reader[2], reader[4], reader[5], reader[3], reader[0], reader[6]);
		    	  
		    	  //read in ticket data
		    	  Ticket newTicket = new Ticket(customer, reader[8], reader[7]);
		    	  
		    	  //add ticket data to ticket array list
		    	  Project3.ticketList.add(newTicket);
		    	  
			  }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Creates log of program activity.
	* @param log The string with the log file name.
	* @return Log file with logs of program activity.
	*/
	public void logger(String log) {
		try {
			//declare new file writer with paramter true to append log file
			FileWriter fw =new FileWriter(log, true);
			
			//create new date to add dates and time to log file
			 SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");  
			 Date date = new Date();  
			 
			 //convert data to string
			 String newDate = formatter.format(date);  
			 
			 //write to log file
			fw.write(newDate+" Loading Employee Data"+"\n");
			
			//print to console
			System.out.println("Loading Employee Data");
			
			//write to log file
			fw.write(newDate+" Loading Ticket Data"+"\n");
			
			//print to console
			System.out.println("Loading Ticket Data");
			
			//write to log file
			fw.write(newDate+" Creating Work Orders"+"\n");
			
			//print to console
			System.out.println("Creating Work Orders");
			
			//write to log file
			fw.write(newDate+" Writing Work Order Data to File"+"\n");
			
			//print to console
			System.out.println("Writing Work Order Data to File");
			
			//for loop iterates over the list of work orders
			for(WorkOrder workorder : Project3.workOrderList) {
				//add work order data to log file
				String data = workorder.getInfo();
				fw.write(data);
			}
			
			//print to console
			System.out.println("Work Orders created. Program Exiting");
			
			//write to log file
			fw.write(newDate+" Work Orders created. Program Exiting"+"\n");
			
			//close file writer
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
