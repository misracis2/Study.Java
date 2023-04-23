package com.example.web_develop_master_package_part3.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueryParamRequest {
    private String name;
    private String email;
    private int age;

    @Override
    public String toString() {
        return "QueryParamRequest{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
