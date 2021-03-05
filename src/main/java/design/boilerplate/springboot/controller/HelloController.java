package design.boilerplate.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on Ağustos, 2020
 *
 * @author Faruk
 */
@Slf4j
@RestController
public class HelloController {

	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {
		log.info("HELLO WORLD!===================================================");
		return ResponseEntity.ok("Hello Spring Boot Boilerplate");
	}

}
