
public class Client {

	//Constants
	public static final int TWO_BUCKS = 2;
	public static final int TEN_BUCKS = 10;
	
	public static void main(String args[]) {

		//Create an instance of a TicketMachine
		TicketMachine ticketMachine = new TicketMachine(TWO_BUCKS);
	
		
		//use the instance to call some methods
		int price = ticketMachine.getPrice();
		System.out.println("current price: " + price);
		
		int balance = ticketMachine.getBalance();
		System.out.println("current balance: " + balance);
		ticketMachine.insertMoney(TEN_BUCKS);
		balance = ticketMachine.getBalance();
		System.out.println("current balance: " + balance);

		ticketMachine.printTicket();
		
		
	}
	
}
