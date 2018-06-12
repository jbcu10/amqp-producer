package com.example.producer.controller;

import com.example.producer.domain.Payload;
import com.example.producer.service.PublisherChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by jb on 12/06/2018.
 */
@RestController
 public class Rest {

    @Autowired
     private PublisherChannel publisherChannel;



    @PostMapping("/greet/{name}")
    public void createGreetings(@PathVariable String name)  {

        Payload  payload= new Payload();
        payload.setMessage("test");
        payload.setEvent("FETCH");
        payload.setPublisher("65143378-ebe8-4084-975b-e93cd5065527");

         Message<Payload> msg = MessageBuilder.withPayload(payload).build();
        publisherChannel.publisher().send(msg);
    }
}

