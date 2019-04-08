package com.luocx.strategypattern.demo;

/**
 * 现金收费抽象类
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-08
 * @since 1.0
 */
public abstract class CashSuper {
    //现金收取超类的抽象方法，收取现金，参数为原价，返回为当前价
    public abstract double acceptCash(double money);
}
