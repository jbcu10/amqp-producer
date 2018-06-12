package com.example.producer;

 import com.example.producer.service.PublisherChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
@EnableBinding(PublisherChannel.class)
@SpringBootApplication

public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}

