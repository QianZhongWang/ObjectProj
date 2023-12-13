package coom.hzw.school.model;

public class Subject {
    // 成员属性 学科名称、学科编号、学制年限
    private String subjectName;
    private String subjectNo;
    private int subjectLife;


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    /**
     * 设置学制年限必须大于0
     *
     * @param subjectLife 学制年限
     */
    public void setSubjectLife(int subjectLife) {
        if (subjectLife < 0) {
            System.out.println("学制年限不能为负数");
            return;
        }
        this.subjectLife = subjectLife;
    }

    /**
     * 专业介绍方法
     *
     * @return 返回专业介绍的方法，包括学科，学科编号，学制
     */
    public String info() {
        return "学科信息如下：\n学科名称：" + this.getSubjectName() + "\n学科编号：" + this.getSubjectNo() + "\n学制年限：" + this.getSubjectLife() + "年";
    }

    public Subject() {
        this.subjectName = "未知";
        this.subjectNo = "未知";
        this.subjectLife = 0;
    }

    public Subject(String subjectName, String subjectNo, int subjectLife) {
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
    }
}
