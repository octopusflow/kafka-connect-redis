package me.yuanbin.kafka.connect.redis;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.connect.sink.SinkRecord;

import java.util.Collection;

public interface RedisClient {

    /**
     * put SinkRecord
     */
    void put(Collection<SinkRecord> records);

    /**
     * Shuts down the client.
     */
    void stop();

    /**
     * set connector config
     * @param connectorConfig connector config
     */
    void setConnectorConfig(AbstractConfig connectorConfig);
}
