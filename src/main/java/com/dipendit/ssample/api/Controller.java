package com.dipendit.ssample.api;

import com.dipendit.ssample.common.Foo1;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private KafkaTemplate<Object, Object> template;

    public Controller(KafkaTemplate<Object, Object> template) {
        this.template = template;
    }

    @PostMapping("/send/foo/{what}")
    public void send(@PathVariable String what) {
        this.template.send("topic1", new Foo1(what));
    }
}
