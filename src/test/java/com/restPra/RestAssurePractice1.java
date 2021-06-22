
package com.restPra;

import static io.restassured.RestAssured.*; 
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestAssurePractice1 {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		Response resp = given().queryParam("page", 2)//.auth().oauth2(DEFAULT_BODY_ROOT_PATH)//.basic(DEFAULT_PATH, DEFAULT_BODY_ROOT_PATH)
		.when().get()
		.then().statusCode(200).contentType("application/json").
		assertThat().body("data[0].last_name", equalTo("Lawson")).log().all().extract().response();
		
		JsonPath js = new JsonPath(resp.asString());
		String lastName = js.get("data[0].last_name");
		System.out.println(js.get("data.last_name"));
		
		assertEquals(lastName, "Lawson");
		
	}
	
}