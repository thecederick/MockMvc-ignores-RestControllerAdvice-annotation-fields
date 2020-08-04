package com.example.demo.root;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Order(Ordered.LOWEST_PRECEDENCE)
public class DefaultControllerAdvice {

    @ExceptionHandler(Throwable.class)
    public String handleException(Throwable throwable) {
        return this.getClass() + " - " + throwable.getClass();
    }
}
