package com.snaplab.gateway.gateway.CodecBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.ServerCodecConfigurer;

@Configuration
public class BeanDefinitions {
    @Bean
    public ServerCodecConfigurer getCodecBean() {
        return ServerCodecConfigurer.create();
    }
}
