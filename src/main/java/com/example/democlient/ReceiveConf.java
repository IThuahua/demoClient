package com.example.democlient;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zhoushenghua on
 */
@Configuration
public class ReceiveConf {

    @Bean
    public Queue queue(){
        return new Queue("queue");
    }
}
