package Set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {

    public static void main(String[] args) {

        TreeSet<Student> s=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num=o1.getAge()-o2.getAge();
                int i = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return i;
            }
        });

        Student s1 = new Student("huang", 24);
        Student s2 = new Student("ren", 22);
        Student s3 = new Student("xiang", 23);
        Student s4 = new Student("zhang", 23);
        Student s5 = new Student("zhang", 23);

        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);

        for (Student i : s) {
            System.out.println(i.getName() + ":" + i.getAge());
        }
    }
}
