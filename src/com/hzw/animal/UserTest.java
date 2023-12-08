package com.hzw.animal;

public class UserTest {

    public static void main(String[] args) {
        User user1 = new User("张三", "123456");
        User user2 = new User("张三", "123456");
        User user3 = new User("李四", "123456");

        UserManage userManage = new UserManage();
        System.out.println(userManage.checkUser(user1, user2));
        System.out.println(userManage.checkUser(user1, user3));

    }

}
