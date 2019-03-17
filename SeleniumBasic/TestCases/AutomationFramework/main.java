package AutomationFramework;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketInformation ticketinformation=new TicketInformation("6/2/2018","Sài Gòn","Nha Trang","soft","1");
			System.out.println(ticketinformation.getDepartdate());
			
			generate a=new generate();
			a.getlink("Sai Gon", "Long Thanh").click();
	}

}
