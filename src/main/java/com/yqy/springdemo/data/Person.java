package com.yqy.springdemo.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component

public class Person {
    private String name;
    private String pwd;
}
