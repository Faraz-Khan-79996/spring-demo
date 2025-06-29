package com.example.deployingTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {
    @GetMapping("/")
    public String home() {
        return "Hello from Spring Boot on Render new!";
    }

    // Simple POST endpoint
    @PostMapping("/greet")
    public Map<String, String> greetUser(@RequestBody Map<String, String> request) {
        String name = request.getOrDefault("name", "Guest");

        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, " + name + "!");
        return response;
    }
}
