import java.util.Random;

import com.github.javafaker.Faker;

public class PetDataCreation {

    public static PetPOJO pet = new PetPOJO();
    public static Faker fake = new Faker();
	
    public PetPOJO newPetData()
    {
    	Random rand = new Random();
	    int numberOfValues = rand.nextInt(5)+1;
	    
    	pet = new PetPOJO();
    	
    	pet.setId(fake.number().digit());
        pet.setName(fake.name().firstName());
        
        String categoryName = "Category " + String.valueOf(numberOfValues);
		pet.setCategory(categoryName, numberOfValues);
    	
		for (int i=0;i<numberOfValues;i++) {
			pet.setPhotoUrl("PhotoURL" + String.valueOf(i), i);
		}
           		
		for (int i=0;i<numberOfValues;i++) {
			pet.setTag("Tag " + String.valueOf(i), i);
		}
        
        pet.setStatus("available");

        return pet;
    }
	
    public PetPOJO updatePetData(int id)
    {
    	Random rand = new Random();
	    int numberOfValues = rand.nextInt(5)+1;
	    
    	pet = new PetPOJO();
    	
    	pet.setId(String.valueOf(id));
        pet.setName(fake.name().firstName());
        
        String categoryName = "Category " + String.valueOf(numberOfValues);
		pet.setCategory(categoryName, numberOfValues);
    	
		for (int i=0;i<numberOfValues;i++) {
			pet.setPhotoUrl("PhotoURL" + String.valueOf(i), i);
		}
           		
		for (int i=0;i<numberOfValues;i++) {
			pet.setTag("Tag " + String.valueOf(i), i);
		}
        
        pet.setStatus("sold");

        return pet;
    }
}
