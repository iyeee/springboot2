package com.atguigu.boot.bean;


import lombok.*;

/**
 * 宠物
 */
@ToString
@Data
@NoArgsConstructor  //无参构造器
@AllArgsConstructor  //全参构造器
@EqualsAndHashCode
public class Pet {

    private String name;

}
