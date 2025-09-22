import java.util.ArrayList;

public class Vehicle {
	private int vehicleSerialNumber;
	private String vehicleName;
	private String vehicleModel;
	private int vehicleYear;
	private int vehicleManufacturer;
	private int vehicleBaseCost;
	public void updateInventory() {
	}
	public ArrayList<Sale_invoice> saleinvoice;
	public void setVehicleBaseCost(int i) {
		// TODO Auto-generated method stub
		this.vehicleBaseCost = i;
	}
	public void getVehicleBaseCost(int i) {
		this.vehicleBaseCost = i;
	}
	public int getVehicleBaseCost() {
		return this.vehicleBaseCost;
	}
} 
