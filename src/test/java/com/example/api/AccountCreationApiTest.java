package com.example.api;

import com.example.models.UserResponse;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountCreationApiTest {
    @Test
    public void createAccountTest() {
        String jsonBody = """
                {
                    "name" : "morpheus",
                    "job" : "leader"
                }
                """;
        UserResponse response = given()
                .contentType("application/json")
                .body(jsonBody)
                .baseUri("https://reqres.in")
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .extract().as(UserResponse.class);
        assertEquals("morpheus", response.getName());
        assertEquals("leader", response.getJob());
    }
}
