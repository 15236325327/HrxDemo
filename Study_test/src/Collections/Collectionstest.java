package Collections;

import Set.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collectionstest {

    public static void main(String[] args) {

        List<Student> c=new ArrayList<Student>();

        Student s1=new Student("c",23);
        Student s2=new Student("h",21);
        Student s3=new Student("b",22);
        Student s4=new Student("t",23);

        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);

        Collections.sort(c, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge()-s2.getAge();
                int i1 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return i1;
            }
        });

        for (Student i : c) {
            System.out.println(i.getName()+":"+i.getAge());
        }

    }
}
