package com.example.producer.service;

 import com.example.producer.utils.Event;
 import org.springframework.cloud.stream.annotation.Output;
 import org.springframework.messaging.MessageChannel;

/**
 * Created by jb on 12/06/2018.
 */
public interface PublisherChannel {

    @Output(Event.FETCH)
    MessageChannel publisher();
}
