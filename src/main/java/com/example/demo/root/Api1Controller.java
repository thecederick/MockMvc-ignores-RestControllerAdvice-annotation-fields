package com.example.demo.root;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Api1Controller {

    @PostMapping(value = "/endpoint1")
    public String endpoint() {
        throw new NullPointerException();
    }
}
