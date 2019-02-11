package com.example.demo.repository;

import com.example.demo.entity.PersonEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface PersonRepository {
    @Select
    List<PersonEntity> findAll();
}