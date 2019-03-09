package com.example.demo.controller;

import com.example.demo.entity.AccountEntity;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService service;

    @GetMapping
    public List<AccountEntity> get(){
        return service.findAll();
    }

}