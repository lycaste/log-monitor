package com.yh.client.kafka.partitioner;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;
import org.apache.kafka.common.PartitionInfo;
import org.apache.kafka.common.utils.Utils;

import java.util.List;
import java.util.Map;

/**
 * Created by yaohao on 2018/3/27.
 */
public class KeyModPartitioner implements Partitioner {

    @Override
    public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
        List<PartitionInfo> partitions = cluster.partitionsForTopic(topic);
        int numPartitions = partitions.size();
        int partitionNum = 0;
        try {
            partitionNum = Utils.murmur2(keyBytes);
        } catch (Exception e) {
            partitionNum = key.hashCode();
        }

        return Math.abs(partitionNum % numPartitions);
    }

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> configs) {

    }
}
