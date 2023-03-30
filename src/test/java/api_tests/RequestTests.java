package api_tests;

import io.restassured.RestAssured;
import models.RegisterUserSuccessfulBody;
import models.UpdateUserRequestBody;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestDataGenerator;

import static io.restassured.RestAssured.given;

public class RequestTests {
    String baseUrl ="https://reqres.in";

    @BeforeClass
    public void setUpLogging() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @Test
    public void userNotFoundTest() {
        given()
                .baseUri(baseUrl)
                .when()
                .get("/api/users/23")
                .then()
                .statusCode(404);
    }

    @Test
    public void getListUsersTest() {
        given()
                .baseUri(baseUrl)
                .queryParam("page", 2)
                .when()
                .get("/api/users")
                .then()
                .statusCode(200);
    }

    @Test
    public void getSingleUserTest() {
        given()
                .baseUri(baseUrl)
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200);
    }

    @Test
    public void getListResourceTest() {
        given()
                .baseUri(baseUrl)
                .when()
                .get("/api/unknown")
                .then()
                .statusCode(200);
    }

    @Test
    public void getSingleResourceTest() {
        given()
                .baseUri(baseUrl)
                .queryParam("id", 2)
                .when()
                .get("/api/unknown/2")
                .then()
                .statusCode(200);
    }

    @Test
    public void updateUserPutTest() {
        UpdateUserRequestBody updateUser = UpdateUserRequestBody
                .builder()
                        .name(TestDataGenerator.generateUsername())
                        .job(TestDataGenerator.generatePassword())
                .build();

        given(PrepareRequestSpec.getUpdateSpecification())
                .body(updateUser)
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void updateUserPatchTest() {
        UpdateUserRequestBody updateUser = UpdateUserRequestBody
                .builder()
                .name(TestDataGenerator.generateUsername())
                .job(TestDataGenerator.generatePassword())
                .build();

        given(PrepareRequestSpec.getUpdateSpecification())
                .body(updateUser)
                .when()
                .patch("/api/users/2")
                .then()
                .statusCode(200);
    }

    @Test
    public void deleteUserTest() {
        given()
                .baseUri(baseUrl)
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(204);
    }

    @Test
    public void registerUserSuccessfulTest() {
        RegisterUserSuccessfulBody  registerBody = RegisterUserSuccessfulBody
                .builder()
                .email("eve.holt@reqres.in")
                .password("pistol")
                .build();

        given(PrepareRequestSpec.getUpdateSpecification())
                .body(registerBody)
                .when()
                .post("/api/register")
                .then()
                .statusCode(200);
    }

    @Test
    public void loginUserSuccessfulTest() {
        RegisterUserSuccessfulBody  registerBody = RegisterUserSuccessfulBody
                .builder()
                .email("eve.holt@reqres.in")
                .password("cityslicka")
                .build();

        given(PrepareRequestSpec.getUpdateSpecification())
                .body(registerBody)
                .when()
                .post("/api/login")
                .then()
                .statusCode(200);
    }
}