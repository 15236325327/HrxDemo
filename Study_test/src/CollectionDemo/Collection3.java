package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection3 {

    public static void main(String[] args) {

        Collection<Student> student = new ArrayList<Student>();

        Student s1 = new Student("黄任翔", 21);
        Student s2 = new Student("陈子航", 22);
        Student s3 = new Student("罗子君", 20);

        student.add(s1);
        student.add(s2);
        student.add(s3);

        //迭代器的使用
        Iterator<Student> it = student.iterator();
        while (it.hasNext()) {
            Student student1 = it.next();
            System.out.println(student1.getName() + ","+student1.getAge());
        }
    }
}
