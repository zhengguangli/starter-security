package wang.icopy.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowT {

    @GetMapping("/success")
    public String test() {
        return "success";
    }

    @GetMapping("/error")
    public String test1() {
        return "error";
    }
}
