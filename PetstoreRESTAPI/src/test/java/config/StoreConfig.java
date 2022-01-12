package config;

import org.junit.jupiter.api.BeforeAll;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class StoreConfig {
	public static RequestSpecification store_requestSpec;
	public static ResponseSpecification store_responseSpec;

	@BeforeAll
	public static void setup() {

		store_requestSpec = new RequestSpecBuilder().
								setBaseUri("http://localhost").
								setBasePath("/api/v3/store/").
								setPort(8080).
								addHeader("Content-Type", "application/json").
								addHeader("Accept", "application/json").
								addFilter(new RequestLoggingFilter()).
								addFilter(new ResponseLoggingFilter()).
								build();

		store_responseSpec = new ResponseSpecBuilder().expectStatusCode(200).build();

		RestAssured.requestSpecification = store_requestSpec;
		RestAssured.responseSpecification = store_responseSpec;
	}

}
