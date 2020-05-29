package com.ww.hallo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloController {

    @GetMapping("/")
    public String index() {
        return "Noch mehr Grüße aus Spring Boot!";
    }
}
