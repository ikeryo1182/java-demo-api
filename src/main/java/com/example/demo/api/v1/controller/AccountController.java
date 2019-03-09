package com.example.demo.api.v1.controller;

import com.example.demo.api.v1.entity.AccountEntity;
import com.example.demo.api.v1.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public AccountEntity post(@RequestBody AccountEntity e) {
        return service.insert(e);
    }

    @PutMapping
    public AccountEntity put(@RequestBody AccountEntity e) {
        return service.update(e);
    }

    @DeleteMapping
    public void delete(@RequestBody AccountEntity e) {
        service.delete(e);
    }
}