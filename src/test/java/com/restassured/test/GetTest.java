package com.restassured.test;


import com.restassured.common.EndPont;
import com.restassured.framework.RestAssuredConfigirations;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.testng.Assert;

import io.restassured.RestAssured;

import java.io.File;
import java.io.PrintStream;

import static io.restassured.RestAssured.*;
import static io.restassured.specification.ProxySpecification.host;

//import static org.hamcrest.core.Is.is;

/**
 * Created by haris on 17/08/17.
 */
public class GetTest extends RestAssuredConfigirations{
    @Test
    public void getTest() throws Exception{
        given().relaxedHTTPSValidation("TLSv1.2")
                .get(EndPont.GET_DETAIL)
                .then()
                .statusCode(200)
                .log()
                .all();

    }
}

