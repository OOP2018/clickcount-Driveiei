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
	 * @param counter the counter to set.
	 * */
	public void setCounter(Counter counter) {
		this.counter = counter;
	}
	
	public void plusButtonHandler(ActionEvent event) {
		counter.add(1);
	}
	
	
	public void minusButtonHandler(ActionEvent event) {
		counter.add(-1);
	}
}
