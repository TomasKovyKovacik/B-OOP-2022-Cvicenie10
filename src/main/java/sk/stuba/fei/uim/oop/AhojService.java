package sk.stuba.fei.uim.oop;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class AhojService implements IGreetingsService {

    @Override
    public String createResponse(HelloRequestBody body) {
        return "ahoj " + body.getName();
    }
}
