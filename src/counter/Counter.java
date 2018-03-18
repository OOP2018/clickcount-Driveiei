package counter;

/**
 * A simple counter.
 * 
 * @author Kornphon Noiprasert
 */
public class Counter extends java.util.Observable{
	private int count = 0;
	
	/**To initialize the counter. */
	public Counter() {
		this.count = 0;
	}
	
	/**
	 * Add the number that want to count.
	 * 
	 * @param howmuch - the number that user want to add.
	 * */
	public void add(int howmuch) {
		count += howmuch;
		// Its like if the Bank sends you an SMS whenever money
		// is deposited in your account. If the SMS just says 
		// "you received a deposit" then you need to login to check it.
		// If the SMS says "you received 5,000 Bt from xxx" then you
		// have everything you need.
		setChanged();
		notifyObservers();
	}
	
	/**
	 * Get the count of counter
	 *
	 * @return count - how much times are count.
	 * */
	public int getCount() {
		return count;
	}
}
