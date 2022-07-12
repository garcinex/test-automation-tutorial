import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SampleAPITest {

    String url = "https://gorest.co.in/public/v2/users";

    @Test
    public void getShouldReturn200() {
        given()
                .when()
                .get(url)
                .then().assertThat().statusCode(200);
    }
}
