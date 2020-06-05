package ChenJiPaiXuSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTestCopy1 {

    public static void main(String[] args) {

        TreeSet<Student> s=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o2.getMathScore() - o1.getMathScore();
                int num1 = num == 0 ? o2.getChinaScore() - o1.getChinaScore() : num;
                int num2 = num1 == 0 ? o2.getName().compareTo(o1.getName()) : num1;
                return num2;
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

        for (Student i : s){
            System.out.println(i.getName()+":"+i.getMathScore()+":"+i.getChinaScore());
        }
    }
}
