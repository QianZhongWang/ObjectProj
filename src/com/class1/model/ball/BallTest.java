package com.class1.model.ball;

public class BallTest {
    //  创建成员内部类Inner_m
    class Inner_m implements Ball {
        @Override
        public void play() {
            System.out.println("Inner_m");
            System.out.println("成员内部类");
        }
    }

    public Ball getInner_m() {
        return new Inner_m();
    }


    // 创建方法内部类Inner_f
    public void info() {
        class Inner_f implements Ball {
            @Override
            public void play() {
                System.out.println("Inner_f");
                System.out.println("方法内部类");
            }
        }
        new Inner_f().play();
    }

    // 定义一个方法 void playBall(Ball ball)，调用play() 方法
    public void playBall(Ball ball) {
        ball.play();
    }
}
