package com.base.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;


/**
 * <P></P>
 * Created by kevin on 2017/8/17 10:59.
 */
public class Receiver {
    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch latch;
    @Autowired
    public Receiver(CountDownLatch latch){
        this.latch = latch;
    }
    public void receiveMessage(String message){
        logger.info("Received <"+ message+ ">");
        latch.countDown();
    }

}
