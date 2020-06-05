package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemo {

    public static void main(String[] args) {

        ArrayList<Student> s=new ArrayList<Student>();

        Student s1=new Student("炎龙铠甲",25);
        Student s2=new Student("风鹰铠甲",26);
        Student s3=new Student("地虎铠甲",22);

        s.add(s1);
        s.add(s2);
        s.add(s3);

        Iterator<Student> it = s.iterator();
        while (it.hasNext()){
            Student s4 = it.next();
            System.out.println(s4.getName()+s4.getAge());
        }
        System.out.println("------");
        for (int i=0;i<s.size();i++){
            Student s4 = s.get(i);
            System.out.println(s4.getName()+s4.getAge());
        }
        System.out.println("------");
        for (Student s4 : s){
            System.out.println(s4.getName()+s4.getAge());
        }
    }
}
