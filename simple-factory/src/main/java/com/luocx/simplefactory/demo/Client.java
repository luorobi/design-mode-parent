package com.luocx.simplefactory.demo;

/**
 * 简单工厂测试
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-08
 * @since 1.0
 */
public class Client {
    public static void main(String[] args) {
        Human man = SampleFactory.makeHuman("man");
        man.say();
        Human woman = SampleFactory.makeHuman("woman");
        woman.say();
        Human test = SampleFactory.makeHuman("tttt");

    }
}
