package org.scsb.ncip.mockncip.data;

import java.util.List;

import org.scsb.ncip.mockncip.models.Item;

public interface ItemMapper {
	
	public Item getItemByBarcode(String itemBarcode);
    public void insertNewItem(Item item);
    public void setItemToLoanedByBarcode(String itemBarcode);
    public void setItemToAvailableByBarcode(String itemBarcode);
    public List<Item> getAllItems();
    public List<Item> getAvailableItems();
    public List<Item> getLoanItems();
}
