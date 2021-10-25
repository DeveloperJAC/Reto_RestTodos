package co.com.sofka.stepdefinition.setup.services;

import io.restassured.RestAssured;


public class Placeholder {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";


    protected void generalSetUp(){
        setUpLog4j2();
        setUpBase();
    }

    protected void setUpBase(){
        RestAssured.baseURI = BASE_URL;
    }

    protected void setUpLog4j2(){
    }
}
