package config;

public interface PetEndPoints {
	String SINGLE_PET_BY_ID = "{petId}";
	String FIND_PET_BY_STATUS = "findByStatus";
	String FIND_PET_BY_TAG = "findByTags";
	String UPLOAD_PET = "{petId}/uploadImage";

}
