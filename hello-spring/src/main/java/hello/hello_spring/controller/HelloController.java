package hello.hello_spring.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello";
    }
    @GetMapping("hello-mvc") //mvc는 html이랑 사바사바한다.
    public String helloMvc(@RequestParam("name") String name, Model model){ //hello-mvc?name=아무거나 적기 이런식으로 url 적어야됨
        model.addAttribute("name", name);
        return "hello-templates";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; // "hello name 여기에 넌 문자"
    }

    @GetMapping("hello-api") //api형식은 객체를 반환한다.
    @ResponseBody
    public Hello helloApi(@RequestParam("name")String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello{ //alt + insert 누르면 단축키 활성
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
