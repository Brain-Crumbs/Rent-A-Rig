package rar.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private List<LineItem> items;
	private double total;
	
	public Cart() {
		this.items = new ArrayList<LineItem>();
		this.total = 0;
	}
	
	public void addItem(LineItem item) {
		// getItemIndex if -1 then add item otherwise update item
		int index = getItemIndex(item);
		
		if (index == -1) {
			this.items.add(item);
		}
		else {
			LineItem existingItem = items.get(index);
			int existingQty = existingItem.getQuantity();
			existingItem.setQuantity(existingQty + item.getQuantity());
		}
		updateTotal();
	}
	
	// when update Cart button is pressed
	public void updateItem(LineItem item) {
		// getItemIndex set quantity or remove item
		// to item at that index
		
		
		updateTotal();
	}
	
	private int getItemIndex(LineItem item) {
		int index = 0;
		for (LineItem existingItem : this.items) {
			if (existingItem.equals(item)) {
				return index;
			}
			else {
				index++;
			}	
		}
		index = -1;
		return index;
	}
	
	
	private void updateTotal() {
		
		//loop through all items and set the total
		double updatedTotal = 0;
		for (LineItem item : this.items) {
			updatedTotal += item.getPrice() * item.getQuantity();
		}
		this.total = updatedTotal;
	}
	
	public double getTotal() {
		
		return this.total;
	}
	
	public int getNumItems() {
		return this.items.size();
	}
	
	public List<LineItem> getItems() {
		return this.items;
	}

}
