package com.example.demo.root;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Api2Controller {

    @PostMapping(value = "/endpoint2")
    public String endpoint() {
        throw new NullPointerException();
    }
}
