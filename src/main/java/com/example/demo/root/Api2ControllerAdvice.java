package com.example.demo.root;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice(assignableTypes = Api2Controller.class)
@ControllerAdvice(assignableTypes = Api2Controller.class)
@ResponseBody
@Order(Ordered.HIGHEST_PRECEDENCE)
public class Api2ControllerAdvice {

    @ExceptionHandler(Throwable.class)
    public String handleException(Throwable throwable) {
        return this.getClass() + " - " + throwable.getClass();
    }
}
