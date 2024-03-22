import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BT2_XML {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Quang Hoang", 18, 3.19, "0905782333"));
        students.add(new Student("Viet Bac", 19, 3.5,"0977299302" ));
        students.add(new Student("Gia Huy", 19, 3.2, "9288278273"));

        String filePath = "sinhvien.xml";

        try {
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = outputFactory.createXMLStreamWriter(new FileWriter(filePath));

            writer.writeStartDocument();
            writer.writeStartElement("students");

            for (Student student : students) {
                writer.writeStartElement("student");
                writer.writeAttribute("name", student.getFullname());
                writer.writeAttribute("age", String.valueOf(student.getAge()));
                writer.writeAttribute("gpa", String.valueOf(student.getGpa()));
                writer.writeAttribute("phonenumber", String.valueOf(student.getPhonenumber()));
                writer.writeEndElement();
            }

            writer.writeEndElement();
            writer.writeEndDocument();

            writer.flush();
            writer.close();

            System.out.println("Tao XML thanh cong");

        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
