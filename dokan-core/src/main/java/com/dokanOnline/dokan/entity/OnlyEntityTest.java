package com.dokanOnline.dokan.entity;

import javax.persistence.*;

@Entity
@Table(name = "branch")
public class OnlyEntityTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer code;

    public OnlyEntityTest(String name,Integer code){
    this.name = name;
    this.code = code;
    }

    public OnlyEntityTest() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
