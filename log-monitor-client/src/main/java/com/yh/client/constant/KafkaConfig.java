package com.yh.client.constant;

import java.util.HashSet;
import java.util.Set;
import static org.apache.kafka.clients.producer.ProducerConfig.*;

/**
 * Created by yaohao on 2018/3/27.
 */
public class KafkaConfig {

    public static final Set<String> PRODUCER_CONFIG_KEYS = new HashSet<String>();

    static {
        PRODUCER_CONFIG_KEYS.add(BOOTSTRAP_SERVERS_CONFIG);
        PRODUCER_CONFIG_KEYS.add(METADATA_MAX_AGE_CONFIG);
        PRODUCER_CONFIG_KEYS.add(BATCH_SIZE_CONFIG);
        PRODUCER_CONFIG_KEYS.add(ACKS_CONFIG);
        PRODUCER_CONFIG_KEYS.add(LINGER_MS_CONFIG);
        PRODUCER_CONFIG_KEYS.add(CLIENT_ID_CONFIG);
        PRODUCER_CONFIG_KEYS.add(SEND_BUFFER_CONFIG);
        PRODUCER_CONFIG_KEYS.add(RECEIVE_BUFFER_CONFIG);
        PRODUCER_CONFIG_KEYS.add(MAX_REQUEST_SIZE_CONFIG);
        PRODUCER_CONFIG_KEYS.add(RECONNECT_BACKOFF_MS_CONFIG);
        PRODUCER_CONFIG_KEYS.add(MAX_BLOCK_MS_CONFIG);
        PRODUCER_CONFIG_KEYS.add(BUFFER_MEMORY_CONFIG);
        PRODUCER_CONFIG_KEYS.add(RETRY_BACKOFF_MS_CONFIG);
        PRODUCER_CONFIG_KEYS.add(COMPRESSION_TYPE_CONFIG);
        PRODUCER_CONFIG_KEYS.add(METRICS_SAMPLE_WINDOW_MS_CONFIG);
        PRODUCER_CONFIG_KEYS.add(METRICS_NUM_SAMPLES_CONFIG);
        PRODUCER_CONFIG_KEYS.add(METRIC_REPORTER_CLASSES_CONFIG);
        PRODUCER_CONFIG_KEYS.add(MAX_IN_FLIGHT_REQUESTS_PER_CONNECTION);
        PRODUCER_CONFIG_KEYS.add(RETRIES_CONFIG);
        PRODUCER_CONFIG_KEYS.add(KEY_SERIALIZER_CLASS_CONFIG);
        PRODUCER_CONFIG_KEYS.add(VALUE_SERIALIZER_CLASS_CONFIG);
        PRODUCER_CONFIG_KEYS.add(CONNECTIONS_MAX_IDLE_MS_CONFIG);
        PRODUCER_CONFIG_KEYS.add(PARTITIONER_CLASS_CONFIG);
        PRODUCER_CONFIG_KEYS.add(REQUEST_TIMEOUT_MS_CONFIG);
        PRODUCER_CONFIG_KEYS.add(INTERCEPTOR_CLASSES_CONFIG);
    }
}
