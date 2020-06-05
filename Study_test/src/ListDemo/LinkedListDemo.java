package ListDemo;

import java.util.LinkedList;
import java.util.Iterator;


public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> s = new LinkedList<Student>();

        Student s1 = new Student("炎龙铠甲", 25);
        Student s2 = new Student("风鹰铠甲", 26);
        Student s3 = new Student("地虎铠甲", 22);
        Student s5 = new Student("雪獒铠甲", 30);
        Student s6 = new Student("帝皇铠甲", 33);

        s.add(s1);
        s.add(s2);
        s.add(s3);

        s.addFirst(s5);
        s.addLast(s6);

        Student t=s.getFirst();
        System.out.println(t.getName());
        Student t1=s.getLast();
        System.out.println(t1.getName());
        System.out.println("------");

        s.removeFirst();
        s.removeLast();

        /*Iterator<Student> it = s.iterator();
        while (it.hasNext()) {
            Student s4 = it.next();
            System.out.println(s4.getName() + s4.getAge());
        }
        System.out.println("------");
        for (int i = 0; i < s.size(); i++) {
            Student s4 = s.get(i);
            System.out.println(s4.getName() + s4.getAge());
        }
        System.out.println("------");*/
        for (Student s4 : s) {
            System.out.println(s4.getName() + s4.getAge());
        }
    }
}
