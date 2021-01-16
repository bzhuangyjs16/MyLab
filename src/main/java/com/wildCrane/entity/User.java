package com.wildCrane.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


@ApiModel(description= "用户信息")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    Integer id;

    @ApiModelProperty("名字")
    String name;

    @ApiModelProperty("地址")
    String address;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
