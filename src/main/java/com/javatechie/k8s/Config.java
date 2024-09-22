package com.javatechie.k8s;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app-detail")
@Data
public class Config {
    private String name;
    private String group;
}
