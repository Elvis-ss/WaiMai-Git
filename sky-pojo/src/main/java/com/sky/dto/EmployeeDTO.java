package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
//新建员工时用户输入的员工信息数据
public class EmployeeDTO implements Serializable {

    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
