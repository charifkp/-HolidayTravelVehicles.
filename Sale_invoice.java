import java.util.ArrayList;

public class Sale_invoice {
	private int saleInvoiceNumber;
	private String Date;
	private int CustomerID;
	private Vehicle PerchasedVehicle;
	private String TradeinVehicle;
	private String DealerOptionCode;
	private int TotalPrice;
	private int texes;
	private int Licensefees;
	public void RecordTradeIn() {
	}
	
	public void AddDealerOption() {
	}
	public ArrayList<SalePerson> saleperson = new ArrayList<>();
	public ArrayList<DealerOption> dealeroption=new ArrayList<>();
	public ArrayList<Customers> customer=new ArrayList<>();
	public ArrayList<Vehicle> vehicle = new ArrayList<>();
	public void addDealerOption(DealerOption option1) {
		// TODO Auto-generated method stub
		DealerOption.add(option1);
	}
	public double Calculatetotal() {
		double total = 0;
        
        for (DealerOption option : dealeroption) {
            total += option.getDealerPrice();
        }
        // Example taxes + fees
        total += 500; // tax
        total += 200; // license fee
        return total;
		
	}
	public void setCustomer(Customers customer2) {
		// TODO Auto-generated method stub
		this.customer = customer;
	}
	public void setVehicle(Vehicle car) {
		// TODO Auto-generated method stub
		this.PerchasedVehicle = car;
	}
	 
	
}
