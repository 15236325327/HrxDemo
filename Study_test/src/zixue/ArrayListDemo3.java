package zixue;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        //创建集合对象
        ArrayList<Student> student=new ArrayList<>();

        //创建学生对象
        Student s1=new Student("小明",30);
        Student s2=new Student("小花",28);
        Student s3=new Student("小刚",24);

        //添加学生到集合中
        student.add(s1);
        student.add(s2);
        student.add(s3);

        //遍历集合
        for (int x=0; x<student.size(); x++){
            Student s=student.get(x);
            System.out.println(s.getName()+":"+s.getAge());
        }
    }
}
