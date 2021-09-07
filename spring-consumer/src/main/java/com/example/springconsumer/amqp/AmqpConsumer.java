package com.example.springconsumer.amqp;

public interface AmqpConsumer<T> {

    void consumer(T t);
    
}
