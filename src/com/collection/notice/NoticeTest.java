package com.collection.notice;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "欢迎来到慕课网", "管理员", new Date());
        Notice notice2 = new Notice(2, "请同学们按时提交作业", "老师", new Date());
        Notice notice3 = new Notice(3, "考勤通知", "老师", new Date());

        ArrayList<Notice> noticeLists = new ArrayList<>();
        noticeLists.add(notice1);
        noticeLists.add(notice2);
        noticeLists.add(notice3);

        System.out.println("公告的内容为：");
        for (Notice notice : noticeLists) {
            System.out.println(notice.getId()+": " + notice.getTitle());
        }

    }
}
