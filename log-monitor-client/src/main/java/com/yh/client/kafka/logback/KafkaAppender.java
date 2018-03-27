package com.yh.client.kafka.logback;

import ch.qos.logback.core.UnsynchronizedAppenderBase;

/**
 * Created by yaohao on 2018/3/28.
 */
public class KafkaAppender<E> extends UnsynchronizedAppenderBase<E> {

    @Override
    protected void append(E e) {

    }
}
