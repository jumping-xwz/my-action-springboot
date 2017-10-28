package com.wjpdev.springboot.springbootindev.dao;

import com.wjpdev.springboot.springbootindev.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @author wjpdeveloper
 * @date 2017/10/28
 */
public interface PersonRepository extends MongoRepository<Person, String> {

    Person findByName(String name);

    @Query("{'age': ?0}")
    List<Person> withQueryFindByAge(Integer age);
}
