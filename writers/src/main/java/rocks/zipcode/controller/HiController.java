package rocks.zipcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    
    @GetMapping("/hi")
    public String sayHi() {
        return "Hello, World!";
    }

    @GetMapping("/hi/{name}")
    public String sayHiToName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }   
    
}
