package api_tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import models.RegisterUserSuccessfulBody;
import models.ResponseRegisterModel;
import models.UpdateUserRequestBody;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestDataGenerator;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;

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
                .statusCode(200)
                .body(matchesJsonSchema(new File("src/test/resources/usersSchema.json")));
    }

    @Test
    public void getSingleUserTest() {
       String first_name = given()
                .baseUri(baseUrl)
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200)
                .body("data.first_name",instanceOf(String.class))
                .extract()
                .path("data.first_name");
    }

    @Test
    public void getListResourceTest() {
        String name = given()
                .baseUri(baseUrl)
                .when()
                .get("/api/unknown")
                .then()
                .statusCode(200)
                .body("data[4].name",instanceOf(String.class))
                .extract()
                .path("data[4].name");
    }

    @Test
    public void getSingleResourceTest() {
        Integer id = given()
                .baseUri(baseUrl)
                .queryParam("id", 2)
                .when()
                .get("/api/unknown/2")
                .then()
                .statusCode(200)
                .body("data.id",instanceOf(Integer.class))
                .extract()
                .path("data.id");
    }

    @Test
    public void updateUserPutTest() {
        UpdateUserRequestBody updateUser = UpdateUserRequestBody
                .builder()
                        .name(TestDataGenerator.generateUsername())
                        .job(TestDataGenerator.generatePassword())
                .build();

        String updatedAt = given(PrepareRequestSpec.getUpdateSpecification())
                .body(updateUser)
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .body("updatedAt",instanceOf(String.class))
                .extract()
                .path("updatedAt");
    }

    @Test
    public void updateUserPatchTest() {
        UpdateUserRequestBody updateUser = UpdateUserRequestBody
                .builder()
                .name(TestDataGenerator.generateUsername())
                .job(TestDataGenerator.generatePassword())
                .build();

        String updatedAt = given(PrepareRequestSpec.getUpdateSpecification())
                .body(updateUser)
                .when()
                .patch("/api/users/2")
                .then()
                .statusCode(200)
                .body("updatedAt",instanceOf(String.class))
                .extract()
                .path("updatedAt");
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

        ResponseRegisterModel response = given(PrepareRequestSpec.getUpdateSpecification())
                .body(registerBody)
                .when()
                .post("/api/register")
                .then()
                .statusCode(200)
                .extract()
                .as(ResponseRegisterModel.class);
    }

    @Test
    public void loginUserSuccessfulTest() {
        RegisterUserSuccessfulBody  registerBody = RegisterUserSuccessfulBody
                .builder()
                .email("eve.holt@reqres.in")
                .password("cityslicka")
                .build();

        String token = given(PrepareRequestSpec.getUpdateSpecification())
                .body(registerBody)
                .when()
                .post("/api/login")
                .then()
                .statusCode(200)
                .body("token",instanceOf(String.class))
                .extract()
                .path("token");
    }

    @Test
    public void updateUserTest() {
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
                .body("name", instanceOf(String.class))
                .body("name", equalTo(updateUser.getName()));
    }

    @Test
    public void updateUserJsonPathTest() {
        JsonPath user = new JsonPath(new File("src/test/resources/users.json"));
        given()
                .baseUri(baseUrl)
                .queryParam("page",2)
                .when()
                .get("/api/users")
                .then()
                .statusCode(200)
                .body("",equalTo(user.getMap("")));
    }
}