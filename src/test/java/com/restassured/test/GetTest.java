package com.restassured.test;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.LogConfig;
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
public class Get {
    @Test
    public void getTest() throws Exception{
        System.out.print("yes");
        //String urlPath="https://any-api.com/openapi/instagram_com.1_0_0.openapi.json";
//        RestAssured.baseURI=urlPath;
//        RestAssured.config = RestAssured.config()
//                                .sslConfig(new SSLConfig().trustStore("./resource/keystore.jks", "password"));

//        String urlPath="http://rest-assured.io/";
//        System.out.print(RestAssured.config);
//        RestAssured.useRelaxedHTTPSValidation();
//          RestAssured.keyStore("./resource/keystore.jks", "password");
//        RestAssured.config = RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames());

//        given().relaxedHTTPSValidation("TLS").when()
//                .when()
//                .get("https://reqres.in/api/users?page=")
//                .then()
//                .statusCode(200)
//                .log();



//        given().log().all().
//                cookie("JSESSIONID", jsessionidId).
//                header("X-XSRF-TOKEN", response.cookie("XSRF-TOKEN")).
//                queryParam("param",paramValue)).
//        body(someData).
//                contentType(JSON).
//                when().
//                post(PREFIX_URL + "/post_some_data").
//                then().
//                log().all().assertThat().statusCode(200);

//        String port = System.getProperty("server.port");
//        System.out.print(port);
//        RestAssured.port=8080;
//
//        String baseHost = System.getProperty("server.host");
//        System.out.print(baseHost);

//        System.setProperty("https.proxyHost", "127.0.0.1");
//        System.setProperty("https.proxyPort", "443");

        PrintStream fileOutPutStream = new PrintStream(new File("logs.log"));
        RestAssured.config = config().logConfig(new LogConfig().defaultStream(fileOutPutStream));

        String urlPath="https://any-api.com:443/openapi/instagram_com.1_0_0.openapi.json";
         given().relaxedHTTPSValidation("TLSv1.2")
                .get(urlPath)
                .then()
                .statusCode(200)
                .log()
                .all();




//        given().config(RestAssured.config)
//                .when()
//                .get("https://reqres.in/api/users?page=")
//                .then()
//                .statusCode(200)
//                .log();
//        given().get(urlPath)
//                .then()
//                .statusCode(200)
//                .log();
    }
}

