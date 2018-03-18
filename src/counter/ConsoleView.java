package counter;

import java.util.Observable;

/**
 * Print the counter value on the console whenever it changes.
 * 
 * @author Kornphon Noiprasert
 */
public class ConsoleView implements java.util.Observer {
	private Counter counter;

	/**
	 * A ConsoleView with reference to a counter (the subject).
	 * 
	 * @param counter the counter to display.
	 */
	public ConsoleView(Counter counter) {
		this.counter = counter;
	}

	/**
	 * This method is called whenever the observed object is changed. An application
	 * calls an Observable object's notifyObservers method to have all the object's
	 * observers notified of the change. 
	 * 
	 * @param o - the observable object.
	 * @param arg - an argument passed to the notifyObservers method.
	 */
	@Override
	public void update(Observable subject, Object info) {
		if (info != null) {
			System.out.println(info);
		}
		System.out.println("Count: " + counter.getCount());
	}
}
