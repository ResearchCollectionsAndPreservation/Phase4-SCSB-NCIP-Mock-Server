package org.scsb.ncip.mockncip.data;

import java.util.List;

import org.scsb.ncip.mockncip.models.Item;
import org.scsb.ncip.mockncip.models.Request;

public interface RequestMapper {
	
	public Request getRequestById(String id);
	public void insertNewRequest(Request request);
	public Request getOpenRequestByItemAndOtherPatron(String itemBarcode,String patronBarcode);
	public void setRequestToClosed(String itemBarcode,String patronBarcode);
	public List<Request> getRequestsByPatronBarcode(String patronBarcode);
	public List<Request> getRequestsByItemBarcode(String itemBarcode);
	public List<Request> getAllRequests();
	public List<Request> getAllOpenRequests();
	public List<Request> getAllClosedRequests();
	public List<Request> getOpenRequestsForPatron(String patronBarcode);
	public Request getOpenRequestForItem(String itemBarcode);

}
