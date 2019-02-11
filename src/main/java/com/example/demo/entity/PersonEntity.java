package com.example.demo.entity;

import lombok.Data;

import org.seasar.doma.*;

@Data
@Entity
@Table(name = "person")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(catalog = "id_seq", sequence = "id_seq", allocationSize = 1)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;
}