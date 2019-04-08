package com.luocx.proxypattern.demo;

/**
 * 追求者类
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-08
 * @since 1.0
 */
public class Pursuit implements GiveGift {
    private SchoolGirl girl;

    public Pursuit(SchoolGirl mm) {
        this.girl = mm;
    }


    @Override
    public void giveDolls() {
        System.out.println("送你洋娃娃"+girl.getName());
    }

    @Override
    public void giveFlowers() {
        System.out.println("送你鲜花"+girl.getName());
    }

    @Override
    public void giveChocolate() {
        System.out.println("送你巧克力"+girl.getName());
    }
}
