package com.itszt.stream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableBinding(Source.class)
public class SendMSController {

    @Autowired
    private Source source;

    @GetMapping("/send/{msg}")
    public String sendMsg(@PathVariable("msg") String msg) {

        boolean send = source.output().send(MessageBuilder.withPayload(msg).build());
        return "发送" + send + ":" + msg;
    }

}
