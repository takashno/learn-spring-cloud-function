package com.zomu.t.learnspringcloudfunction;


import com.zomu.t.learnspringcloudfunction.bean.Hoge;
import com.zomu.t.learnspringcloudfunction.function.HogeConsumer;
import com.zomu.t.learnspringcloudfunction.function.HogeFunction;
import com.zomu.t.learnspringcloudfunction.function.HogeSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class LearnSpringCloudFunctionConfiguration {

    @Bean
    public Function<Flux<String>, Flux<String>> uppercase() {
        return flux -> flux.map(value -> value.toUpperCase());
    }

    @Bean("supplier")
    public Supplier<Hoge> sup() {
        return new HogeSupplier();
    }

    @Bean("function")
    public Function<Mono<String>, Mono<String>> function() {
        return new HogeFunction();
    }

    @Bean("consumer")
    public Consumer<String> consumer() {
        return new HogeConsumer();
    }
}