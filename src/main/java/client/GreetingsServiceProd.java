package client;

import org.springframework.web.client.RestTemplate;

public class GreetingsServiceProd implements GreetingsServiceI {
    public Greeting getGreetings(){
        final String uri = "http://localhost:9090/greeting?name=Prod";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, Greeting.class);
    }
}
