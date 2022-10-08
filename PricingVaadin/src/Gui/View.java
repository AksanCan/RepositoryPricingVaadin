package Gui;

public class View implements Observer{

	
	private Strategy s;
	private Subject[] m;
	private GUI g;
	
	public View(Strategy s, Subject... m){
		
		this.s=s;
		this.m=m;
		
		for(Subject subject : m) {
			subject.addObserver(this);
		}
		
		g = new GUI(s);

	}
	
	@Override
	public void update(double price) {
		g.setPrice(price);
	}
	

}
