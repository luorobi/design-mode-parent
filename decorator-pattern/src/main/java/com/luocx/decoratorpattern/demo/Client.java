package com.luocx.decoratorpattern.demo;

/**
 * 客户端测试代码
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-08
 * @since 1.0
 */
public class Client {
    public static void main(String[] args) {
        String name = "小菜";
        Person person = new Person(name) {
            @Override
            public void show() {
                System.out.print("装扮的" + name);
            }
        };

        System.out.print("第一种装扮：");
        Sneakers sneakers = new Sneakers(); //破球鞋
        BigTrouser bigTrouser = new BigTrouser(); //垮裤
        TShirts tShirts = new TShirts(); //T恤

        sneakers.Decorate(person);
        bigTrouser.Decorate(sneakers);
        tShirts.Decorate(bigTrouser);
        tShirts.show();


        System.out.print("\n第二种装扮：");
        LeatherShoes leatherShoes = new LeatherShoes(); //皮鞋
        Tie tie = new Tie(); //领带
        Suit suit = new Suit(); //西装

        leatherShoes.Decorate(person);
        tie.Decorate(leatherShoes);
        suit.Decorate(tie);
        suit.show();
    }
}
