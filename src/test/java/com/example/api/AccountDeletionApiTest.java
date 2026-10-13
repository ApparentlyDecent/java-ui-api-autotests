package com.example.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class AccountDeletionApiTest {
    @Test
    public void testAccountDeleteApi() {
        given()
                .baseUri("https://reqres.in")
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(204);
    }
}