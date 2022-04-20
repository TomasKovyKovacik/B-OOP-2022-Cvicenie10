package sk.stuba.fei.uim.oop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private int counter = 0;

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/helloObject")
    public HelloResponse helloObject() {
        return new HelloResponse(counter++, "hello world");
    }
}
