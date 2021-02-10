package iva.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGretingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Primary Bean!";
    }
}
