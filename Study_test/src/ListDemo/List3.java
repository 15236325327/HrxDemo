package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List3 {

    public static void main(String[] args) {

        List<Student> s = new ArrayList<Student>();

        Student s1 = new Student("黄任翔", 21);
        Student s2 = new Student("陈子航", 22);
        Student s3 = new Student("罗子君", 20);

        s.add(0, s2);
        s.add(1, s3);
        s.add(2, s1);

        //迭代器遍历
        Iterator<Student> it = s.iterator();
        while (it.hasNext()) {
            Student t = it.next();
            System.out.println(t.getName() + ":" + t.getAge());
        }

        //普通for遍历
        for (int i = 0; i < s.size(); i++) {
            Student t1 = s.get(i);
            System.out.println(t1.getName() + ":" + t1.getAge());
        }

        System.out.println("--------");

        //增强for循环遍历
        for (Student t : s) {
            System.out.println(t.getName() + ":" + t.getAge());
        }
    }
}
