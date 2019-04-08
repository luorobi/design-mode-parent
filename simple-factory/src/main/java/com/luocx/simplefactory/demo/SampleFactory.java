package com.luocx.simplefactory.demo;

/**
 * 简单工厂
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-08
 * @since 1.0
 */
public class SampleFactory {

    public static Human makeHuman(String type){
        if(type.equals("man")){
            Human man = new Man();
            return man;
        }else if(type.equals("woman")){
            Human woman = new Woman();
            return woman;
        }else{
            System.out.println("生产不出来");
            return null;
        }
    }
}
