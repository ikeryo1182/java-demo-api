package com.example.demo.api.v1.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    @SequenceGenerator(name = "id_seq", sequenceName = "id_seq", allocationSize = 1)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;
}