package com.dungnguyen.elasticsearchdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class People implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String address;
}
