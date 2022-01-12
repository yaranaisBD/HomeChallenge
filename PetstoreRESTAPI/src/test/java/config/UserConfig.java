package config;

import org.junit.jupiter.api.BeforeAll;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class UserConfig {
	public static RequestSpecification user_requestSpec;
	public static ResponseSpecification user_responseSpec;

	@BeforeAll
	public static void setup() {

		user_requestSpec = new RequestSpecBuilder().
								setBaseUri("http://localhost").
								setBasePath("/api/v3/user/").
								setPort(8080).
								addHeader("Content-Type", "application/json").
								addHeader("Accept", "application/json").
								addFilter(new RequestLoggingFilter()).
								addFilter(new ResponseLoggingFilter()).
								build();

		user_responseSpec = new ResponseSpecBuilder().expectStatusCode(200).build();

		RestAssured.requestSpecification = user_requestSpec;
		RestAssured.responseSpecification = user_responseSpec;
	}

}