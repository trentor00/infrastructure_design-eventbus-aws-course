package es.antoniogo.app.api.api_shop;

import es.antoniogo.contexts.shared.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApiShopApplicationTests {

	@Autowired
	private MyService myService;

	@Test
	void contextLoads() {
	}

	@Test
	public void message() {
		assertThat(myService.message()).isNotNull();
	}

}
