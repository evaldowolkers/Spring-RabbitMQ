package com.example.springproducer.service.implementation;

import com.example.springproducer.amqp.AmqpProducer;
import com.example.springproducer.service.AmqpService;
import com.example.springproducer.dto.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl  implements AmqpService{

    @Autowired
    private AmqpProducer<Message> amqp;

    @Override
    public void sendToConsumer(Message message) {
        System.out.println("Evaldo");
        amqp.producer(message);
    }
    
}
