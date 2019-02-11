package com.example.demo.service;

import com.example.demo.entity.PersonEntity;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<PersonEntity> findAll() {
        return personRepository.findAll();
    }
}