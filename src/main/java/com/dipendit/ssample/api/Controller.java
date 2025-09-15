package com.dipendit.ssample.api;

import com.dipendit.ssample.common.Foo1;
import com.dipendit.ssample.common.Foo2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Logger LOG = LoggerFactory.getLogger(Controller.class);

    private KafkaTemplate<Object, Object> template;

    public Controller(KafkaTemplate<Object, Object> template) {
        this.template = template;
    }

    @PostMapping("/send/foo/{what}")
    public void send(@PathVariable String what) {
        this.template.send("topic1", new Foo2(what))
                .whenComplete((result, ex) -> {
                    if (ex == null) {
                        LOG.info("Message sent successfully: {}", result.getProducerRecord().value());
                    } else {
                        LOG.error("Failed to send message", ex);
                    }
                });
    }
}
