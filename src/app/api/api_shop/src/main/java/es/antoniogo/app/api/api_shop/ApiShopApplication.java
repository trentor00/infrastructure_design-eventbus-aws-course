package es.antoniogo.app.api.api_shop;

import es.antoniogo.contexts.shared.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "es.antoniogo")
@RestController
public class ApiShopApplication {

	private final MyService myService;

    public ApiShopApplication(MyService myService) {
        this.myService = myService;
    }

	@GetMapping("/")
	public String home() {
		return myService.message();
	}

    public static void main(String[] args) {
		SpringApplication.run(ApiShopApplication.class, args);
	}

}
