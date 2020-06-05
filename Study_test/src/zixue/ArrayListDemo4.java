package zixue;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        //创建集合对象
        ArrayList<Student1> student1=new ArrayList<>();

        /*//键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name=sc.nextLine();
        System.out.println("请输入学生性别：");
        String sex=sc.nextLine();

        //创建学生对象，把录入的数据赋值给成员变量
        Student1 x=new Student1();
        x.setName(name);
        x.setSex(sex);

        //往集合中添加对象
        student1.add(x);*/

        //（用方法改进，提高复用性）
        addStudent(student1);
        addStudent(student1);
        addStudent(student1);

        //遍历集合，采用通用格式
        for (int i=0; i<student1.size(); i++){
            Student1 h=student1.get(i);
            System.out.println(h.getName()+":"+h.getSex());
        }

    }

    public static void addStudent(ArrayList<Student1> student1){

        //键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name=sc.nextLine();
        System.out.println("请输入学生性别：");
        String sex=sc.nextLine();

        //创建学生对象，把录入的数据赋值给成员变量
        Student1 x=new Student1();
        x.setName(name);
        x.setSex(sex);

        //往集合中添加对象
        student1.add(x);
    }
}
