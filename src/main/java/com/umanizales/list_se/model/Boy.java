package com.umanizales.list_se.model;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class Boy {
    private String identificaton;
    private String name;
    private Byte age;
    private String gender;

}
