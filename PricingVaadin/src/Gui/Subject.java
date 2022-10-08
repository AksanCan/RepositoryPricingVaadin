package Gui;

public interface Subject {
	public void notifyObserver(); 
	public void addObserver(Observer o);
	public void deleteObserver();
}
