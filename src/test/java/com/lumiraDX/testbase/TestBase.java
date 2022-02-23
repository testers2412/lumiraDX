package com.lumiraDX.testbase;

import com.lumiraDX.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader =propertyReader.getInstance();

        //   RestAssured.baseURI = "http://localhost";
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
     //RestAssured.port = 8888;
        RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
     //   RestAssured.basePath= "/api";
        RestAssured.basePath = propertyReader.getProperty("basePath");

}
}