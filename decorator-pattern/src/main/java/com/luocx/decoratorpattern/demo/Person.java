package com.luocx.decoratorpattern.demo;

import lombok.Data;

/**
 * 具体构建角色
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-08
 * @since 1.0
 */
@Data
public abstract class Person {

    private String name;

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public abstract void show();
}
