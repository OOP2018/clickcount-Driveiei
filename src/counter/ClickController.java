package counter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Controller for the Counter buttons user interface.
 * 
 * @author Kornphon Noiprasert
 */
public class ClickController {
	@FXML
	private Button plusbutton;
	@FXML
	private Button minusbutton;
	/** The counter that records button clicks. */
	private Counter counter = null;

	/**
	 * To initialize the counter.
	 * 
	 * @param counter the counter to set.
	 * */
	public void setCounter(Counter counter) {
		this.counter = counter;
	}
	
	/**
	 * Plus the number of counter by 1.
	 * */
	public void plusButtonHandler(ActionEvent event) {
		counter.add(1);
	}
	
	/**
	 * Minus the number of counter by 1.
	 * */
	public void minusButtonHandler(ActionEvent event) {
		counter.add(-1);
	}
}
