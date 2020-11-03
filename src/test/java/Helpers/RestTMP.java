package Helpers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
public class RestTMP {
    String url = "http://localhost:3000/";
    RequestSpecification httpRequest;
    Response response;

    @Test
    public void t() {
        JSONObject params = new JSONObject();
        params.put("name","ATeam");
        params.put("email","Ateam@gmail.com");

        RestAssured.baseURI = url;
        httpRequest = RestAssured.given().auth().preemptive().basic("admin", "admin");
        httpRequest.header("Content-Type","application/json");

        httpRequest.body(params.toJSONString());
//        response = httpRequest.delete("/api/teams/1");
//        response = httpRequest.put("/api/teams/1");
        response = httpRequest.post("/api/teams");
//        response = httpRequest.get("/api/teams/search?perpage=50&page=1");
        response.prettyPrint();
    }
}
