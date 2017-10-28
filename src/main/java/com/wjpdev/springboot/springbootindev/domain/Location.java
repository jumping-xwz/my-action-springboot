package com.wjpdev.springboot.springbootindev.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author wjpdeveloper
 * @date 2017/10/28
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    private String place;
    private Integer year;
}
