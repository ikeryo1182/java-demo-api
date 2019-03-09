package com.example.demo.api.v1.service;

import com.example.demo.api.v1.entity.AccountEntity;
import com.example.demo.api.v1.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AccountService {

    @Autowired
    AccountRepository repository;

    public List<AccountEntity> findAll(){
        return repository.findAll(new Sort(Sort.Direction.ASC,"id"));
    }

    public AccountEntity insert(AccountEntity e) {
        if ( e.getId() != null ) {
            return null;
        }

        return repository.save(e);
    }

    public AccountEntity update(AccountEntity e) {
        if ( e.getId() == null ) {
            return null;
        }

        return repository.save(e);
    }

    public void delete(AccountEntity e) {
        repository.delete(e);
    }
}