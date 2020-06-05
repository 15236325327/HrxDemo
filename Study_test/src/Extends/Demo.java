package Extends;

public class Demo {

    public static void main(String[] args) {

        Student s=new Student();
        s.setName("黄任翔");
        s.setAge("21");
        System.out.println(s.getName()+":"+s.getAge());
        s.study();

        Teacher t=new Teacher();
        t.setName("刘旋");
        t.setAge("22");
        System.out.println(t.getName()+":"+t.getAge());
        t.teacher();

        //带参构造
        Teacher t1=new Teacher("风清扬","33");
        System.out.println(t1.getName()+":"+t1.getAge());
    }
}
