package com.collection.notice;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void printNotice(ArrayList<Notice> noticeLists) {
        System.out.println("公告的内容为：");
        for (Notice notice : noticeLists) {
            System.out.println(notice.getId() + ": " + notice.getTitle());
        }
    }
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "欢迎来到慕课网", "管理员", new Date());
        Notice notice2 = new Notice(2, "请同学们按时提交作业", "老师", new Date());
        Notice notice3 = new Notice(3, "考勤通知", "老师", new Date());

        ArrayList<Notice> noticeLists = new ArrayList<>();
        noticeLists.add(notice1);
        noticeLists.add(notice2);
        noticeLists.add(notice3);

        printNotice(noticeLists);

        // 添加公告
        Notice notice4 = new Notice(4, "在线编辑器可以使用了", "管理员", new Date());
        noticeLists.add(1, notice4);
        printNotice(noticeLists);

        // 删除公告
        noticeLists.remove(2);
        printNotice(noticeLists);

        // 修改公告
        noticeLists.get(2).setTitle("Java在线编辑器可以使用了");
        printNotice(noticeLists);

    }
}
