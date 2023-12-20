package com.class1.model.ball;

public class Test {
    public static void main(String[] args) {
        // 完成成员内部内的调用
        BallTest bt = new BallTest();
        BallTest.Inner_m im = bt.new Inner_m();
        bt.playBall(im);

        // 完成方法内部类的调用
        bt.info();

        // 完成匿名内部类的调用
        bt.playBall(new Ball() {
            @Override
            public void play() {
                System.out.println("匿名内部类");
            }
        });


    }
}
