package com.qa.lombok;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private  String name;
    private int age;
    private String city;
    private boolean isActive;
    private String dob;
}
