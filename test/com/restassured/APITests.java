package com.restassured;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;

public class APITests extends RestAssuredBase {

    @Test
    public void getPets(){
        given().
            log().all().
        when().
            get("https://petstore.swagger.io/v2/pet/findByStatus?status=pending").
        then().
            log().all().
            body("findAll { it.id = '9223372036854775516' }.status", hasItems("pending"))
            .statusCode(200);
    }
}
