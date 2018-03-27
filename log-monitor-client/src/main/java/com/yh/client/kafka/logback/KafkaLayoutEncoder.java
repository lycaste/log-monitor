package com.yh.client.kafka.logback;

import ch.qos.logback.core.Layout;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;

import java.nio.charset.Charset;

/**
 * Created by yaohao on 2018/3/27.
 */
public class KafkaLayoutEncoder<E> extends ContextAwareBase implements LifeCycle {

    // layout
    private Layout<E> layout;
    // 编码，默认utf-8
    private Charset charset;
    private boolean started = false;
    private static final Charset UTF8 = Charset.forName("UTF-8");

    public String doEncode(E event) {
        return this.layout.doLayout(event);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isStarted() {
        return false;
    }

    public Layout<E> getLayout() {
        return layout;
    }

    public void setLayout(Layout<E> layout) {
        this.layout = layout;
    }

    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }
}
