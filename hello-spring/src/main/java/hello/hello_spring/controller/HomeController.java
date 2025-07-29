package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/") //걍 host8080하면 첫번째로 호출되는놈
    public String home(){
        return "home";
    }
}
