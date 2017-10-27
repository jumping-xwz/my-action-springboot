package com.wjpdev.springboot.springbootindev.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author wjpdeveloper
 * @date 2017/10/27
 */
@Component
@ConfigurationProperties(prefix = "book")
@Getter
@Setter
public class BookSettings {
    private String name;
    private String author;
}
