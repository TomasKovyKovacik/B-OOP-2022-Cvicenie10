package sk.stuba.fei.uim.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class HelloResponse {
    private int counter;
    private String message;
}
