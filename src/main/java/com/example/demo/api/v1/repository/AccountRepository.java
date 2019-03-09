package com.example.demo.api.v1.repository;

import com.example.demo.api.v1.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity,Integer> {
}