package com.wjpdev.springboot.springbootindev.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * @author wjpdeveloper
 * @date 2017/10/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Person {

    @Id
    private String id;
    private String name;
    private Integer age;

    @Field("locs")
    private Collection<Location> locations = new LinkedHashSet<Location>();

    public Person(String name, Integer age){
        super();
        this.name = name;
        this.age = age;
    }
}
