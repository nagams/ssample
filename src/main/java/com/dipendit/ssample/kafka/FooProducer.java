package com.dipendit.ssample.kafka;

import com.dipendit.ssample.common.Foo1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class FooProducer {

    private final KafkaTemplate<Object, Object> template;

    public FooProducer(KafkaTemplate<Object, Object> template) {
        this.template = template;
    }

    private final Logger LOG  = LoggerFactory.getLogger(FooProducer.class);

    public void sendFoo(Foo1 foo) {
        LOG.info("Sending Foo to Kafka: {}", foo);
        template.send("foo", foo);
    }

}
