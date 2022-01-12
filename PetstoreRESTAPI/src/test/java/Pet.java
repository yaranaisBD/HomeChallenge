import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import config.PetConfig;
import config.PetEndPoints;
import static io.restassured.RestAssured.*;

import java.io.File;

public class Pet extends PetConfig {

	@DisplayName("Add a new pet to the store")
	@Tag("Pet")
	@Tag("POSTPet")
	@Test
	public void addNewPet() {
		given().
			body(new PetDataCreation().newPetData().petJSON()). 
			log().all().
		when().
			post().
		then();
	}
	
	@DisplayName("Update a pet to the store by ID")
	@Tag("Pet")
	@Tag("POSTPet")
	@Test
	public void updatePet() {
		given().
			pathParam("petId","1").
			queryParam("name", "Updated Name").
			queryParam("status", "sold").
			log().all().
		when().
			post(PetEndPoints.SINGLE_PET_BY_ID).
		then();
	}
	
	@DisplayName("Update a pet to the store")
	@Tag("Pet")
	@Tag("PUTPet")
	@Test
	public void updatePetbyId() {
		given().
			body(new PetDataCreation().updatePetData(1).petJSON()).
			log().all().
		when().
			put().
		then();
	}
	
	@DisplayName("Upload image a pet")
	@Tag("Pet")
	@Tag("POSTPet")
	@Test
	public void uploadImagePet() {
		given().
			pathParam("petId","1").
			//header("Content-Type","text/csv").
			body(new File("C:\\Users\\18099\\YPepper.jpg")).
			log().all().
		when().
			post(PetEndPoints.UPLOAD_PET).
		then();
	}
	
	
	@DisplayName("Get all pets by giving status")
	@Tag("Pet")
	@Tag("GETPet")
	@Test
	public void findPetByStatus() {
		given().
			queryParam("status", "available").
		when().
			get(PetEndPoints.FIND_PET_BY_STATUS).
		then().log().all();
	}

	@DisplayName("Get all pets by giving tag")
	@Tag("Pet")
	@Tag("GETPet")
	@Test
	public void findPetByTags() {
		given().
			queryParam("tags", "tag1").
		when().
			get(PetEndPoints.FIND_PET_BY_TAG).
		then().log().all();

	}

	@DisplayName("Get a pet by giving Pet ID")
	@Tag("Pet")
	@Tag("GETPet")
	@Test
	public void findPetByPetID() {
		given().
		when().
			get("3").
		then().log().all();
	}
	
	@DisplayName("Delete a pet by giving Pet ID")
	@Tag("Pet")
	@Tag("DeletePet")
	@Test 
	public void deletePet() { 
		given(). 
			pathParam("petId", 15).
		when() .
			delete(PetEndPoints.SINGLE_PET_BY_ID). 
		then(); 
	}
	
}
