package com.sunshine.dubbo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private long id;

    private String name;

    private int age;

    private boolean sex;



}
