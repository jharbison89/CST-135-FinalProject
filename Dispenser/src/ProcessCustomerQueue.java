import java.io.*;

public class ProcessCustomerQueue {

	private java.util.Queue<String> customerQueue;
	
	private String fileName = "Customer Queue.csv";	
	
	public ProcessCustomerQueue() {
		fillQueue();
	}
	
	
	// fills the queue with the names and items from the .csv file
	public void fillQueue() {
		String input;
		customerQueue = new java.util.LinkedList<>();
		
		try {
			FileReader fileReader = new FileReader(fileName);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while(!(input = bufferedReader.readLine()).equals("END")) {
				customerQueue.offer(input);
			}
			
			bufferedReader.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("unable to open file '" + fileName);
		}
		catch(IOException ex) {
			System.out.println("Error reading file " + fileName);
		}
	}
	
	// returns the next person and item in queue
	public String first() {
		return customerQueue.peek();
	}
	
	// returns how many are in queue
	public int length() {
		return customerQueue.size();
	}
	
	// adds another to the queue
	public void in(String input) {
		customerQueue.offer(input);
	}
	
	// removes the next in the queue
	public String out() {
		return customerQueue.poll();
	}
	
	// returns true if the queu is empty
	public boolean isEmpty() {
		if(customerQueue.size() > 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	// gets the name of the next person in queue
	public String nextCustomerName() {
		return customerQueue.peek().substring(0, customerQueue.peek().indexOf(","));
	}
	
	// gets the name of the product the next person in queue wants
	public String nextCustomerProduct() {
		return customerQueue.peek().substring(customerQueue.peek().indexOf(",") + 1);
	}
	
	// dispense item for the next person in queue and remove them from queue
	public void	processNextInQueue(Dispenser dispenser) {
		int complete = 0;		
		for(int i = 0; i < dispenser.getSize(); i ++) {
			if(nextCustomerProduct().toUpperCase().equals(dispenser.getProductName(i).toUpperCase())){
				// reduce quantitiy by one of the selected item
				dispenser.setProductCurrentInventory(i, dispenser.getProductCurrentInventory(i) - 1);
				complete = 1;
				break;
			}
		}
		
		
		// if no exact match is found, dispense first available item
		if(complete == 0) {
			for(int i = 0; i < dispenser.getSize(); i ++) {
				if(dispenser.getProductCurrentInventory(i) > 0) {
					dispenser.setProductCurrentInventory(i, dispenser.getProductCurrentInventory(i) - 1);			
				}
			}
		}
		
		out();
	}
}
	

