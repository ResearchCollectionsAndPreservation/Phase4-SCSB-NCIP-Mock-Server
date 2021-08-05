package org.scsb.ncip.mockncip.data;

import java.util.List;

import org.scsb.ncip.mockncip.models.Patron;

public interface PatronMapper {
	
	public Patron getPatronByBarcode(String barcode);
	public List<Patron> getAllPatrons();

}
