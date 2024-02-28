package API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqresIn {

    @Test
    public void getTest() {
        Response response = given()
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/")
                .when()
                .get("api/users?page")
                .then().log().all()
                .extract().response();
    }

    @Test
    public void postTest() {
        String Avatar = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";

        //                String body = "{\"name\": \"morpheus\", \"job\": \"leader\"}";


        Response response = given()
                .baseUri("https://reqres.in/")
                .contentType(ContentType.JSON)
                .when()
                .body(Avatar)
                .post( "/api/users")
                .then().log().all()
                .statusCode(201)
                .extract().response();
    }

    @Test
    public void postPojoClassTest() {
        Pojo pojo = new Pojo("eve.holt@reqres.in", "pistol");
        Response response = given()
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/")
                .when()
                .body(pojo)
                .post("/api/register")
                .then().log().all()
                .extract().response();
    }

}