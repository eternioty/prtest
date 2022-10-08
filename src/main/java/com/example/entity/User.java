package com.example.entity;

import lombok.Data;

@Data
public class User {
    private String name;
    private int age;
    private String address;
    private double price;
    private float height;
    static String msg1 = "master test";
    static String msg2 = "hot-fix test";
    static String msge = "push test";
    static String msge = "pull test";
}
