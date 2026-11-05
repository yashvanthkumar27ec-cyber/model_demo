
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/check")
    public String check(@RequestParam int value) {

        if (value >= 18) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }
}
