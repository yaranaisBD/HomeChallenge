package config;

import org.junit.jupiter.api.BeforeAll;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class PetConfig {
	public static RequestSpecification pet_requestSpec;
	public static ResponseSpecification pet_responseSpec;

	@BeforeAll
	public static void setup() {

		pet_requestSpec = new RequestSpecBuilder().setBaseUri("http://localhost").
							setBasePath("/api/v3/pet/").
							setPort(8080).
							addHeader("Content-Type", "application/json").
							addHeader("Accept", "application/json").
							addFilter(new RequestLoggingFilter()).
							addFilter(new ResponseLoggingFilter()).
							build();

		pet_responseSpec = new ResponseSpecBuilder().expectStatusCode(200).build();

		RestAssured.requestSpecification = pet_requestSpec;
		RestAssured.responseSpecification = pet_responseSpec;
	}

}
