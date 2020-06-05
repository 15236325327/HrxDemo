package Collections;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Colections2 {

    public static void main(String[] args) {

        ArrayList<Student> a = new ArrayList<Student>();

        Student s1 = new Student("c", 23);
        Student s2 = new Student("h", 21);
        Student s3 = new Student("b", 22);
        Student s4 = new Student("t", 23);

        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);

        Collections.sort(a, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int i = s1.getAge() - s2.getAge();
                int i1 = i == 0 ? s1.getName().compareTo(s2.getName()) : i;
                return i1;
            }
        });

        for (Student i : a){
            System.out.println(i.getName()+":"+i.getAge());
        }
    }
}
