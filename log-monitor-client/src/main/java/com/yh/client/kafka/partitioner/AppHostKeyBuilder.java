package com.yh.client.kafka.partitioner;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ContextAwareBase;

import java.nio.ByteBuffer;

/**
 * Created by yaohao on 2018/3/27.
 */
public class AppHostKeyBuilder<E> extends ContextAwareBase implements KeyBuilder<E>{

    private byte[] appHost;

    @Override
    public void setContext(Context context) {
        super.setContext(context);
        String host = context.getProperty(CoreConstants.HOSTNAME_KEY);
        String app = context.getName();
        appHost = ByteBuffer.allocate(4).putInt(new StringBuilder(app).append(host).toString().hashCode()).array();
    }

    /**
     * 生成key，key规则app+host的byte[]
     * @param e log event, ch.qos.logback.classic.spi.ILoggingEvent
     * @return
     */
    @Override
    public byte[] build(E e) {
        return appHost;
    }

    public byte[] getAppHost() {
        return appHost;
    }

    public void setAppHost(byte[] appHost) {
        this.appHost = appHost;
    }

}
