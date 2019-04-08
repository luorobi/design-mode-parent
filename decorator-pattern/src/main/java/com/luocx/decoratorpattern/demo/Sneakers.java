package com.luocx.decoratorpattern.demo;

/**
 * 具体服饰类[ConcreteDecorator]之‘垮裤’
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-08
 * @since 1.0
 */
public class Sneakers extends Finery {
    @Override
    public void show() {
        System.out.print("垮裤    ");
        super.show();
    }


}
