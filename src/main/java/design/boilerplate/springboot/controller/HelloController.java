package design.boilerplate.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RestController
public class HelloController {

//	@GetMapping("/hello")
//	public ResponseEntity<String> sayHello() {
//		log.info("HELLO WORLD!===================================================");
//		return ResponseEntity.ok("Hello Spring Boot Boilerplate");
//	}
//
//	@PostMapping(path = "/members")
//	public void addMemberV1(@RequestBody Member member) {
//		//code
//	}
//
//	@PostMapping(path = "/members", produces = MediaType.APPLICATION_XML_VALUE)
//	public void addMemberV2(@RequestBody Member member) {
//		//code
//	}

	@GetMapping("/hello")
	// Query parameters - Eg. /hello?sort=true
	public ResponseEntity<String> sayHelloId(@RequestParam("sort") Optional<Boolean> id) {
		if (id.isPresent()) {
			return ResponseEntity.ok("Hello; sorted = " + id.get());
		} else {
			return ResponseEntity.ok("Hello - query param");
		}
	}

	@GetMapping("/hi/{id}")
	// Path parameters /hi/:id
	public ResponseEntity<String> sayHiId(@PathVariable("id") Optional<Integer> id) {
		if (id.isPresent()) {
			return ResponseEntity.ok("Hi " + id.get());
		} else {
			return ResponseEntity.ok("Hi - path param");
		}
	}



}
