import java.util.ArrayList;

public class DealerOption {
	private String DealerOptionCode;
	private String DealerDescription;
	private int DealerPrice;
	public DealerOption(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
		this.DealerDescription = string;
		this.DealerOptionCode = string2;
		this.DealerPrice = i;
	}
	public void calculateOptionCost() {
	}
	public ArrayList<Sale_invoice> saleinvoice;
	public static void add(DealerOption option1) {
		// TODO Auto-generated method stub
		
	}
	public double getDealerPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
