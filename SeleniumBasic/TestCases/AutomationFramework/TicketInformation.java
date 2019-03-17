package AutomationFramework;

public class TicketInformation {
	String departdate;
	String departstation;
	String arrivestation;
	String seattype;
	String ticketamount;
	
	public TicketInformation(String departdate,String departstation,String arrivestation,String seattype,String ticketamount) {
		this.departdate=departdate;
		this.departstation=departstation;
		this.arrivestation=arrivestation;
		this.seattype=seattype;
		this.ticketamount=ticketamount;
	}
	
	
	public String getDepartdate() {
		return departdate;
	}
	public void setDepartdate(String departdate) {
		this.departdate = departdate;
	}
	public String getDepartstation() {
		return departstation;
	}
	public void setDepartstation(String departstation) {
		this.departstation = departstation;
	}
	public String getArrivestation() {
		return arrivestation;
	}
	public void setArrivestation(String arrivestation) {
		this.arrivestation = arrivestation;
	}
	public String getTicketamount() {
		return ticketamount;
	}
	public void setTicketamount(String ticketamount) {
		this.ticketamount = ticketamount;
	}
}
