/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.bus.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author lh on 2016/8/24 13:32.
 */
@Component
public class Receiver {

    @RabbitListener(queues = "myQueue")
    public void processMessage(Message message) {
        byte[] body = message.getBody();
        System.out.println("收到消息: '" + new String(body) + "'");
    }

}