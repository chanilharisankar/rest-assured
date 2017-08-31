package com.restassured.framework;


import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

public class RestAssuredConfigirations {

    @BeforeSuite(alwaysRun = true)
    public void configigure(){
        RestAssured.baseURI="https://any-api.com";
        RestAssured.port=443;
        RestAssured.basePath="/openapi";
        }
}
