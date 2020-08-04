package com.example.demo.root;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class Api2ControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private Api1Controller controller;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders
                .standaloneSetup(controller)
                .addDispatcherServletCustomizer(
                        dispatcherServlet -> dispatcherServlet.setThrowExceptionIfNoHandlerFound(true))
                .setControllerAdvice(
                        Api2ControllerAdvice.class,
                        DefaultControllerAdvice.class)
                .build();
    }

    @Test
    void notFound() throws Exception {
        mockMvc
                .perform(
                        post("/test")
                                .contentType("application/json")
                                .content("{}"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string(
                        "class com.example.demo.root.DefaultControllerAdvice - class org.springframework.web.servlet.NoHandlerFoundException"));
    }

}
