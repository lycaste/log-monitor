package com.yh.client.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

import java.util.Map;

/**
 * Created by yaohao on 2018/3/27.
 */
public class LazySingletonProducer {

    private static volatile Producer<byte[], String> producer;

    private LazySingletonProducer() {

    }


    public static Producer<byte[], String> getInstance(Map<String, Object> config) {
        if (producer == null) {
            synchronized(LazySingletonProducer.class) {
                if (producer == null) {
                    producer = new KafkaProducer<byte[], String>(config);
                }
            }
        }
        return producer;
    }


    public static boolean isInstanced() {
        return producer != null;
    }
}
