package co.edu.uptc.model;

public class Invoice {
	private int pairsPurchased;
    private String brand;
    
    public Invoice() {
    	
    }

	public int getPairsPurchased() {
		return pairsPurchased;
	}

	public void setPairsPurchased(int pairsPurchased) {
		this.pairsPurchased = pairsPurchased;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
    
	@Override
	public String toString() {
		StringBuilder invoiceInformation = new StringBuilder();
		invoiceInformation.append("Detalles de la Factura").append("\n")
		.append("Pares Comprados: ").append(getPairsPurchased()).append("\n")
		.append("Marca De los zapatos: ").append(getBrand());
		return invoiceInformation.toString();
	}
    
}
