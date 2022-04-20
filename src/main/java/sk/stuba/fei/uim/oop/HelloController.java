package sk.stuba.fei.uim.oop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/path/{name}")
    public String helloPath(@PathVariable("name") String name) {
        return "hello " + name;
    }

    @GetMapping("/param")
    public String helloParam(@RequestParam(name = "name", defaultValue = "world") String name) {
        return "hello " + name;
    }


}
