import java.util.ArrayList;

public class SalePerson {
	private int saleID;
	private String saleName;
	private String contactInfo;
	public Sale_invoice createInvoice(Customers customer, Vehicle car) {
		Sale_invoice invoice = new Sale_invoice(); // make a new invoice
        invoice.setCustomer(customer);
        invoice.setVehicle(car);
		return invoice;
	}
	public ArrayList<Vehicle> vehicles;
	
}
