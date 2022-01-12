import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import config.UserConfig;
import config.UserEndPoints;
import static io.restassured.RestAssured.*;


import java.util.Random;


//chassidy.blanda
//qam792hyvjrjab
public class User extends UserConfig{
	
    public static String newUserName;
    public static String newUserPassword;
	

	@DisplayName("Create user")
	@Tag("User")
	@Tag("POSTUser")	
	@Test
	public void postNewUser() {
		UserDataCreation userBody = new UserDataCreation();
		
			given().
				body(userBody.NewUserData().userJSON()).
				log().all().
			when().
				post().
			then().
				log().all();
	}	
	
	@DisplayName("Create users with given input array")
	@Tag("User")
	@Tag("POSTUSer")	
	@Test
	public void postNewUsers() {
		UserDataCreation userBody = new UserDataCreation();
		String userBodyList = "[";
		Random rand = new Random();
	    int numberOfUsers = rand.nextInt(10);
		
		for (int i=0;i<numberOfUsers;i++) {
			userBodyList = userBodyList + userBody.NewUserData().userJSON();
			if (i!=numberOfUsers-1)
				userBodyList = userBodyList + ",";
		}
		
		userBodyList = userBodyList + "]";
		
			given().
				body(userBodyList).
				log().all().
			when().
				post(UserEndPoints.USER_CRETA_WITH_LIST).
			then().
				log().all();
	}	
	
	
	@DisplayName("Update user")
	@Tag("User")
	@Tag("PUTUser")	
	@Test
	public void updateUser() {
		UserDataCreation userBody = new UserDataCreation();
		
		given().
			pathParam("username","lana.schmidt").
			body(userBody.NewUserData().userJSON()).
			log().all().
		when().
			put(UserEndPoints.USER_BY_USERNAME).
		then();
	}	
	
	
	@DisplayName("Delete user by ID")
	@Tag("User")
	@Tag("DELETEUser")	
	@Test
	public void deleteUserByUsername() {
		UserDataCreation userBody = new UserDataCreation();
		
		given().
			pathParam("username","quentin.goyette").
			body(userBody.NewUserData().userJSON())
			.log().all().
		when().
			delete(UserEndPoints.USER_BY_USERNAME).
		then();
	}
	
	@DisplayName("Logs user into the system")
	@Tag("User")
	@Tag("GETUser")
	@Test
	public void loginUser() {
		given().
			queryParam("username", "chassidy.blanda").
			queryParam("password", "qam792hyvjrjab").
			log().all().
		when().
			get(UserEndPoints.USER_LOGIN).
		then().log().all();
	}
	
	@DisplayName("Logs out current user in user session")
	@Tag("User")
	@Tag("GETUser")
	@Test
	public void logoutUser() {
		given().
			log().all().
		when().
			get(UserEndPoints.USER_LOGOUT).
		then().log().all();

	}
	
	@DisplayName("Get user by username")
	@Tag("User")
	@Tag("GETUser")
	@Test
	public void getUserByUsername() {
		given().
			pathParam("username", "user1").
			log().all().
		when().
			get(UserEndPoints.USER_BY_USERNAME).
		then().log().all();
	}
	
	
}
