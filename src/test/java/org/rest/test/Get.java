package org.rest.test;


import io.restassured.config.SSLConfig;
import org.testng.annotations.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

//import static org.hamcrest.core.Is.is;

/**
 * Created by haris on 17/08/17.
 */
public class Get {
    @Test
    public void getTest(){
        System.out.print("yes");
        String urlPath="https://any-api.com/openapi/instagram_com.1_0_0.openapi.json";
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







        given().relaxedHTTPSValidation("TLSv1.2")
                .get(urlPath)
                .then()
                .statusCode(200)
                .log()
                .all();

//
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

