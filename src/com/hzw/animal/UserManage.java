package com.hzw.animal;

public class UserManage {
    public String checkUser(User user1, User user2) {
        if (user1.getUserName().equals(user2.getUserName()) && user1.getPassword().equals(user2.getPassword())) {
            return "验证成功";
        } else {
            return "用户名或密码不一致";
        }
    }
}
