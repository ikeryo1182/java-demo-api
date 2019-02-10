package com.example.demo.service;

import com.example.demo.entity.PersonEntity;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonService {

    @Autowired
    PersonRepository repository;

    public List<PersonEntity> findAll(){
        return repository.findAll(new Sort(Sort.Direction.ASC,"id"));
    }
}