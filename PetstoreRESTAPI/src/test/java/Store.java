import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import config.StoreConfig;
import config.StoreEndPoints;
import static io.restassured.RestAssured.*;

public class Store extends StoreConfig {

	@DisplayName("Returns a map of status codes to quantities")
	@Tag("Store")
	@Tag("GETStore")	
	@Test
	public void getPetInventoryByStatus() {
		given()
			.log().all().
		when().
			get(StoreEndPoints.STORE_INVENTORY).
		then();
	}
	
	@DisplayName("Place a new order in the store")
	@Tag("Store")
	@Tag("POSTStore")	
	@Test
	public void putNewOrder() {
		StoreDataCreation storeBody = new StoreDataCreation();
		
		given().
			body(storeBody.NewOrderData().storeJSON()).
			log().all().
		when().
			post(StoreEndPoints.STORE_ORDER).
		then();
	}	

	@DisplayName("Find purchase order by ID")
	@Tag("Store")
	@Tag("GETStore")	
	@Test
	public void getOrderByID() {
		given().pathParam("orderId", 814)
			.log().all().
		when().
			get(StoreEndPoints.STORE_ORDER_BY_ID).
		then();
	}	
	
	@DisplayName("Delete purchase order by ID")
	@Tag("Store")
	@Tag("DELETEStore")	
	@Test
	public void deleteOrderByID() {
		given().pathParam("orderId", 814)
			.log().all().
		when().
			delete(StoreEndPoints.STORE_ORDER_BY_ID).
		then();
	}
	
}
