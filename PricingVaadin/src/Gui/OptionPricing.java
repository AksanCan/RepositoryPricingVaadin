package Gui;

public abstract class OptionPricing implements Model{
	private Observer o;
	private double price;
	
	public OptionPricing() {
		
	}

	protected Observer getO() {
		return o;
	}

	protected void setO(Observer o) {
		this.o = o;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}
	
}
