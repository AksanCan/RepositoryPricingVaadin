package Gui;

public class BlackScholesModel extends OptionPricing{
	
	public BlackScholesModel() {
	}
	
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		this.getO().update(getPrice());
	}

	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		this.setO(o);
	}

	@Override
	public void deleteObserver() {
		// TODO Auto-generated method stub
		this.setO(null);
	}

}
