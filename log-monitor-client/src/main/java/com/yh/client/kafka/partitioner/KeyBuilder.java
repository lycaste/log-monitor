package com.yh.client.kafka.partitioner;

/**
 * Created by yaohao on 2018/3/27.
 */
public interface KeyBuilder<E> {

    byte[] build(E e);
}
