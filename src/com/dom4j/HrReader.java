package com.dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class HrReader {
    public static void main(String[] args) {
        String xmlFile = "src/com/xml/hr.xml";
        // SAXReader 类是读取xml的核心类，用于将xml解析后以“树”的形式存储在内存中
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(xmlFile);

            Element root = document.getRootElement();
            List<Element> employees = root.elements("employee");
            for (Element employee : employees) {
                String name = employee.elementText("name");
                String age = employee.elementText("age");
                String salary = employee.elementText("salary");
                Attribute att = employee.attribute("no");
                System.out.println("name: " + name + ", age: " + age + ", salary: " + salary+" "+att.getName()+": "+att.getValue());
                employee.elements("department").forEach(department -> {
                    String dname = department.elementText("dname");
                    String address = department.elementText("address");
                    System.out.println("departmentName: " + dname + ", departmentLocation: " + address);
                });
            }

        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }

    }
}
