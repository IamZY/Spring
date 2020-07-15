package com.ntuzy.demoreactor.reactor8;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

/**
 * @Author IamZY
 * @create 2020/7/15 8:25
 */
public class TestReactor {
    public static void main(String[] args) {

        // 声明数据流
        Flux.just(1, 2, 3, 4).subscribe(System.out::print);
        Mono.just(1).subscribe(System.out::print);

        Integer[] array = {1, 2, 3, 4};
        Flux.fromArray(array);


        List<Integer> list = Arrays.asList(array);
        Flux.fromIterable(list);


    }
}
