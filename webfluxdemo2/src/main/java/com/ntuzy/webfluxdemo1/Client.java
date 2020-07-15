package com.ntuzy.webfluxdemo1;

import com.ntuzy.webfluxdemo1.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.nio.Buffer;

/**
 * @Author IamZY
 * @create 2020/7/15 11:04
 */
public class Client {
    public static void main(String[] args) {
        WebClient webClient = WebClient.create("http://127.0.0.1:7834");

        String id = "1";
        User user = webClient.get().uri("/user/{id}", id).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(User.class).block();
        System.out.println(user.getName());


        Flux<User> userFlux =
                webClient.get().uri("/users").accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(User.class);

        userFlux.map(stu->stu.getName()).buffer().doOnNext(System.out::println).blockFirst();

    }
}
