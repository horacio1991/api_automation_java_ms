package test;

import org.apache.http.HttpStatus;
import org.junit.Test;
import utils.Settings;
import static io.restassured.RestAssured.when;

public class TestEmployee {

    @Test
    public void postEmployee_verifySavedEmployee() {
        when().
                get(Settings.BASE_URI)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
