package com.example.demo.controller;

import com.example.demo.entity.PersonEntity;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService service;

    @GetMapping
    public List<PersonEntity> get(){
        return service.findAll();
    }

}