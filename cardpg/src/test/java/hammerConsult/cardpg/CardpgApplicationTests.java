package hammerConsult.cardpg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "keycloak.client-secret=test-only-secret")
class CardpgApplicationTests {

	@Test
	void contextLoads() {
	}

}
