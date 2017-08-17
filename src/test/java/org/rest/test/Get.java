package org.rest.test;


import org.testng.annotations.Test;
import org.testng.Assert;

import static io.restassured.RestAssured.registerParser;
import static io.restassured.RestAssured.unregisterParser;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.Is.is;

/**
 * Created by haris on 17/08/17.
 */
public class Get {
    @Test
    public void getTest(){
        System.out.print("yes");
        when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("page", is(2));
    }
}
