package design.boilerplate.springboot.controller;

import design.boilerplate.springboot.model.Url;
import design.boilerplate.springboot.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@RestController
public class UrlController {
    @Autowired
    private UrlRepository urlRepository;

//    @GetMapping("/")
//    // GET
//    public ResponseEntity<String> getRedirectedUrl(@PathVariable("generatedHash") Optional<String> generatedHash) {
//        if (generatedHash.isPresent()) {
//            //TODO
//        } else {
//            //TODO
//        }
//    }

    @PostMapping(path="/url")
    public ResponseEntity<Url> post(@RequestParam String url) {
        // TODO: validation

        Url newUrl = new Url();
        newUrl.setOriginalUrl(url);

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String generatedHash = getHash(url + timeStamp);

        newUrl.setGeneratedHash(generatedHash);

        urlRepository.save(newUrl);

        return ResponseEntity.ok(newUrl);


    }

    private String getHash(String stringToHash) {
        return stringToHash.hashCode() + "-hash";
    }
}
