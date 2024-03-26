package co.edu.uptc.model;

public class OrderManager {
	private final Shoes shoes;
	
	public OrderManager() {
		shoes = new Shoes();
	}
	
	public Invoice createInvoice(int pairsPurchased,String brand) {
	     Invoice invoice = new Invoice();
	     invoice.setBrand(brand);
	     invoice.setPairsPurchased(pairsPurchased);
	  
	     return invoice;
	}
	
	public boolean evaluateVerlonSize(int digitedSize){
		if(digitedSize>=19&&digitedSize<=30){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean evaluateVelezSize(int digitedSize){
		if(digitedSize>=35&&digitedSize<=43){
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean evaluateBossiSize(int digitedSize){
		if(digitedSize>=31&&digitedSize<=38){
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
