package Gui;

public class GUI {
	
	private Strategy c;
	private double price;
	
	public GUI(Strategy s) {
		
		this.c =s;

	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	

}
