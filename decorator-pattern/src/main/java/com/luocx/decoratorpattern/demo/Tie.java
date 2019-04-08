package com.luocx.decoratorpattern.demo;

/**
 * 具体服饰类[ConcreteDecorator]之‘领带’
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-08
 * @since 1.0
 */
public class Tie extends Finery{
    @Override
    public void show() {
        System.out.print("领带    ");
        super.show();
    }

}
