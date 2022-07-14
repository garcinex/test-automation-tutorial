import io.restassured.RestAssured;
import org.example.TestListeners;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Listeners({TestListeners.class})
public class SampleAPITest {

    String url = "https://gorest.co.in/public/v2/users";

    @Test
    public void getShouldReturn200() {
        RestAssured.proxy("localhost", 3128);
        RestAssured.useRelaxedHTTPSValidation();

        given()
                .when()
                .get(url)
                .then().assertThat().statusCode(200);
    }
}
