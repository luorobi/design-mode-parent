package com.luocx.strategypattern.demo;

/**
 * 打折收费子类，继承现金收费抽象类
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-08
 * @since 1.0
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 1;

    public CashRebate(String moneyRebate) {
        //打折收费，初始化时，必须输入折扣率,如八折，就是0.8
        this.moneyRebate = Double.valueOf(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }

}
