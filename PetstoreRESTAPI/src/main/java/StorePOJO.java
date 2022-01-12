
public class StorePOJO {
    private int id;
    private String petID;
    private int quantity;
    private String shipDate;
    private String status;
    private boolean complete;
	
	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetID() {
        return petID;
    }

    public void setPetID(String petID) {
        this.petID = petID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean getComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String storeJSON() {
    	String storeBody = "{\r\n"
    			+ "  \"id\": " + id + ",\r\n"
    			+ "  \"petId\": " + petID + ",\r\n"
    			+ "  \"quantity\": " + quantity + ",\r\n"
    			+ "  \"shipDate\": \"" + shipDate + "\",\r\n"
    			+ "  \"status\": \""+ status + "\",\r\n"
    			+ "  \"complete\": " + complete + "\r\n"
    			+ "}";
    	   	
    	return storeBody;
    	
    }
    
    @Override
	public String toString() {
		return "StorePojo [id = " + id + ", petID = " + petID + ", quantity = " + quantity + ", shipDate = " + shipDate
				+ ", status = " + status + ", complete = " + complete + "]";
	}

}
