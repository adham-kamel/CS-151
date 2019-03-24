import java.util.*;
import javax.swing.event.*;

/**
 * An invoice for a sale, consisting of line items.
 */
public class Invoice {
	/**
	 * Constructs a blank invoice.
	 */
	public Invoice() {
		items = new ArrayList<>();
		listeners = new ArrayList<>();
	}

	/**
	 * Adds an item to the invoice.
	 * 
	 * @param item
	 *            the item to add
	 */
	public void addItem(LineItem item) {
		items.add(item);
		// Notify all observers of the change to the invoice
		ChangeEvent event = new ChangeEvent(this);
		for (ChangeListener listener : listeners)
			listener.stateChanged(event);
	}

	/**
	 * Adds a change listener to the invoice.
	 * 
	 * @param listener
	 *            the change listener to add
	 */
	public void addChangeListener(ChangeListener listener) {
		listeners.add(listener);
	}

	/**
	 * Gets an iterator that iterates through the items.
	 * 
	 * @return an iterator for the items
	 */
	public Iterator<LineItem> getItems() {
		return new Iterator<LineItem>() {
			public boolean hasNext() {
				return current < items.size();
			}

			public LineItem next() {
				return items.get(current++);
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}

			private int current = 0;
		};
	}

	public int getHammerCount(){
		return hammerCount;
	}
	
	public int getBundleCount(){
		return bundleCount;
	}
	
	public double getHammerTotal(){
		return hammerPrice;
	}
	
	public double getBundleTotal(){
		return bundlePrice;
	}
	
	public double getHammerSingle(){
		return hammerSingle;
	}
	
	public double getBundleSingle(){
		return bundleSingle;
	}
	
	public double getTotalPrice(){
		return totalPrice;
	}
	public void setCounts(){
		Iterator<LineItem> iter = getItems();
		totalPrice = 0;
		hammerPrice = 0;
		bundlePrice = 0;
		hammerCount = 0;
		bundleCount = 0;
		while (iter.hasNext()){
			LineItem item = iter.next();
			totalPrice += item.getPrice();
			if (item.toString().equals("Hammer")){
				hammerSingle = item.getPrice();
				hammerPrice += item.getPrice();
				hammerCount++;
			}
			if (item.toString().contains("Ass")){
				bundleSingle = item.getPrice();
				bundlePrice += item.getPrice();
				bundleCount++;
			}
		}
	}
	public String format(InvoiceFormatter formatter) {
		String r = formatter.formatHeader();
		//Iterator<LineItem> iter = getItems();
		setCounts();
		r += formatter.formatHammerLine(this);
		r += formatter.formatBundleLine(this);
		return r + formatter.formatFooter(this);
	}

	private double totalPrice;
	private double hammerSingle;
	private double bundleSingle;
	private double hammerPrice;
	private double bundlePrice;
	private int hammerCount;
	private int bundleCount;
	private ArrayList<LineItem> items;
	private ArrayList<ChangeListener> listeners;
}