package sk.stuba.fei.uim.oop;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IGreetingsService {

    @Override
    public String createResponse(HelloRequestBody body) {
        return "hello " + body.getName();
    }
}
