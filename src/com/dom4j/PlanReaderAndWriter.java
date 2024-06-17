package com.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class PlanReaderAndWriter {

    private String xmlFile = "src/com/xml/plan.xml";

    public static void main(String[] args) {
        PlanReaderAndWriter planReaderAndWriter = new PlanReaderAndWriter();
        planReaderAndWriter.ReadPlan();
        planReaderAndWriter.WritePlan();
        planReaderAndWriter.ReadPlan();
    }

    /**
     * ReadPlan
     */
    public void ReadPlan() {
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(xmlFile);
            Element root = document.getRootElement();
            System.out.println("root: " + root.getName());
            root.elements("course").forEach(course -> {
                String name = course.elementText("course-name");
                String hour = course.elementText("class-hour");
                String exam = course.elementText("exam-form");
                System.out.println("name: " + name + ", hour: " + hour + ", exam: " + exam);
            });
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }

    }

    public void WritePlan() {
        SAXReader reader = new SAXReader();

        try {
            Document document = reader.read(xmlFile);
            Element root = document.getRootElement();
            Element course = root.addElement("course");
            course.addElement("course-name").addText("计算机网络");
            course.addElement("class-hour").addText("48");
            course.addElement("exam-form").addText("考试");
            course.addAttribute("no", "1001");


             Writer writer = new OutputStreamWriter(new FileOutputStream(xmlFile), "UTF-8");

             document.write(writer);
             writer.close();

        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();


        }
    }

}
