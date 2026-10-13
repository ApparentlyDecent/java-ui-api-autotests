package com.example.api;

import com.example.models.UserResponse;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountUpdateApiTest {
    @Test
    public void testAccountUpdateApi() {
        UserResponse response = given()
                .contentType("application/json")
                .body("{\"name\": \"morpheus\", \"job\": \"zion resident\"}")
                .baseUri("https://reqres.in")
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .extract().as(UserResponse.class);
        assertEquals("morpheus", response.getName());
        assertEquals("zion resident", response.getJob());
    }
}
