package com.luocx.decoratorpattern.demo;

/**
 * 具体服饰类[ConcreteDecorator]之‘破球鞋’
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-08
 * @since 1.0
 */
public class BigTrouser extends Finery {
    @Override
    public void show() {
        System.out.print("破球鞋    ");
        super.show();
    }


}
