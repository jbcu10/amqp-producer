package com.example.producer.domain;

import java.time.Instant;

/**
 * Created by jb on 12/06/2018.
 */
public class Payload {

    private Instant dateTime = Instant.now();
    private String event;
    private String publisher;
    private String message;

    public Instant getDateTime() {
        return dateTime;
    }

    public void setDateTime(Instant dateTime) {
        this.dateTime = dateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
