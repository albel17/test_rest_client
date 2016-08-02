package client;

import org.springframework.web.client.RestTemplate;

public class GreetingsService implements GreetingsServiceI {

    public Greeting getGreetings(){
        final String uri = "http://localhost:9090/greeting";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, Greeting.class);
    }
}
