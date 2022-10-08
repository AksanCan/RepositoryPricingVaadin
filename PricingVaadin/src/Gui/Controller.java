package Gui;

public class Controller implements Strategy{
	private Model[] model;
	
	/**
	 * 
	 * @param model (Array that contains Model objects).
	 * @author can_a
	 */
	public Controller(Model... model) {
		this.model = model;
		//The constructor generates a view object.
		View view = new View(this, model);
	}

	@Override
	public double calcPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
