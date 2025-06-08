package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class CalculationApiController {
    @PostMapping("/calculation")
    public Map<String, String> calculation(@RequestBody Map<String, String> body) {
        
        int i1 = Integer.parseInt(body.get("value1"));
        int i2 = Integer.parseInt(body.get("value2"));
        String result = Integer.toString(i1 + i2);
        return Map.of("result", result);
    }
    
    

}
