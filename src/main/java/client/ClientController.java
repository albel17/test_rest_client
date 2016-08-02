package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    final private GreetingsServiceI greetingsService;

    @Autowired
    public ClientController(GreetingsServiceI greetingsService) {
        this.greetingsService = greetingsService;
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return greetingsService.getGreetings();
    }
}
