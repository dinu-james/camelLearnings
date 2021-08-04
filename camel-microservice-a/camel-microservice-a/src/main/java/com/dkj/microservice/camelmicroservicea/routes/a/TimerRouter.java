package com.dkj.microservice.camelmicroservicea.routes.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TimerRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:first-timer").
                transform().constant("Hello").
                to("log:first-timer");
    }
}
