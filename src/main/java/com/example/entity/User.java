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
    static String msg3 = "push test";
    static String msg4 = "pull test";

}
