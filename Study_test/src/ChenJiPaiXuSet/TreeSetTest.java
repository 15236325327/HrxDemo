package ChenJiPaiXuSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<Student> s = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //主要条件
                int num = s1.getMathScore() - s2.getMathScore();
                //次要条件
                int num1 = num == 0 ? s1.getChinaScore() - s2.getChinaScore() : num;
                int num2 = num1 == 0 ? s1.getName().compareTo(s2.getName()) : num1;
                return num1;
            }
        });

        Student s1 = new Student("黄任翔", 100, 95);
        Student s2 = new Student("张飞", 20, 30);
        Student s3 = new Student("关羽", 60, 80);
        Student s4 = new Student("刘备", 100, 90);
        Student s5 = new Student("陈备", 100, 90);

        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);

        for (Student i : s) {
            System.out.println(i.getName() + ":" + i.getMathScore() + ":" + i.getChinaScore());
        }
    }
}
