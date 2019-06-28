package com.example.democlient;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author zhoushenghua on
 */
@Component
public class HelloReceive {

//    @RabbitListener(queues = "queue")
//    public void process(UserVo userVo){
//        System.out.println("Receive:" + userVo);
//    }


    @RabbitListener(queues = "topic.msg")
    public void process(String str){
        System.out.println("Receive msg:" + str);
    }

    @RabbitListener(queues = "topic.message")
    public void process1(String str){
        System.out.println("Receive message:" + str);
    }





}
