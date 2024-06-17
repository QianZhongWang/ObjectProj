package com.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HrWriter {

    public void write(){
        String xmlFile = "src/com/xml/hr.xml";
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(xmlFile);
            Element root = document.getRootElement();

            Element employee = root.addElement("employee");
            employee.addElement("name").addText("Tom");
            employee.addElement("age").addText("30");
            employee.addElement("salary").addText("3000");
            employee.addAttribute("no","1001");
            Element department = employee.addElement("department");
            department.addElement("dname").addText("研发部");
            department.addElement("address").addText("北京");



            Writer writer = new OutputStreamWriter(new FileOutputStream(xmlFile),"UTF-8");

            document.write(writer);
            writer.close();


        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new HrWriter().write();
    }
}
