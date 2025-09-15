package com.dipendit.ssample.kafka;

import com.dipendit.ssample.common.Foo2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class FooConsumer {

    private final Logger LOG  = LoggerFactory.getLogger(FooProducer.class);

    @Value("${ssample.foo}")
    private String serverProp;

    @KafkaListener(
            id = "fooGroup",
            topics = "topic1",
            autoStartup = "true"
    )
    public void listen(Foo2 foo) {
        LOG.info("Received: {}", foo);
        LOG.info("From config server: {} ", serverProp);
        if (foo.getFoo().startsWith("fail")) {
            throw new RuntimeException("Failed");
        }
    }

    @KafkaListener(id = "dltGroup", topics = "topic1-dlt")
    public void dltListen(byte[] in) {
        LOG.info("Received from DLT: {}", new String(in));
    }
}
