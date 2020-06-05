package Set;

import java.util.TreeSet;

public class TreeSetDemo2 {

    public static void main(String[] args) {

        TreeSet<Student> s = new TreeSet<Student>();

        Student s1 = new Student("huang", 23);
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
