package com.luocx.proxypattern.demo;

/**
 * 客户端测试代码
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-08
 * @since 1.0
 */
public class Client {
    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl();
        girl.setName("李娇娇");

        Proxy proxy = new Proxy(girl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }

}
