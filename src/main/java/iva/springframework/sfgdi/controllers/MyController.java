package iva.springframework.sfgdi.controllers;


import iva.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public  final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
    return  greetingService.sayGreeting();
    }
}
