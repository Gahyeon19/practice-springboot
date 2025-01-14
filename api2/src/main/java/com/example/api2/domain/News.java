package com.example.api2.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class News {
    private int id;
    private String title;
    private String img;
    private String date;
    private String content;
}
