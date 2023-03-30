package api_tests;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class PrepareRequestSpec {
    static String baseUrl ="https://reqres.in";

    public static RequestSpecification getUpdateSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .setContentType(ContentType.JSON)
                .build();
    }
}