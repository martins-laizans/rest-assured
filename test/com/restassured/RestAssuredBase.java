package com.restassured;

import io.restassured.RestAssured;

public class RestAssuredBase {
    public RestAssuredBase(){
        RestAssured.useRelaxedHTTPSValidation();
    }
}
