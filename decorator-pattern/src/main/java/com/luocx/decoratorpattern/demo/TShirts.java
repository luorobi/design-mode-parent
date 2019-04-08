package com.luocx.decoratorpattern.demo;

/**
 * 具体服饰类[ConcreteDecorator]之‘T恤’
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-08
 * @since 1.0
 */
public class TShirts extends Finery {
    @Override
    public void show() {
        System.out.print("T恤    ");// 在实际开发中，此应该为对人数据进行处理的过程。
        super.show();// 父类处理的过程
    }

}
