package lianxi;

import java.util.ArrayList;
import java.util.Scanner;

public class Text1Demo {

    public static void main(String[] args) {

        //创建集合对象
        ArrayList<Text1> student = new ArrayList<>();

       /* //键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name=sc.nextLine();
        System.out.println("请输入你的年龄：");
        String age=sc.nextLine();
        System.out.println("请输入你的性别：");
        String sex=sc.nextLine();

        //创建学生对象，把录入的数据赋值给成员变量
        Text1 x=new Text1();
        x.setName(name);
        x.setAge(age);
        x.setSex(sex);

        //往集合中添加对象
        student.add(x);

        //输出对象
        System.out.println(x.getName()+x.getAge()+x.getSex());*/

        //（用方法改进，提高复用性）
        addstudent(student);
        addstudent(student);
        addstudent(student);

        //遍历集合，采用通用格式
        for (int i = 0; i < student.size(); i++) {
            Text1 h =student.get(i);
        //输出对象
        System.out.println(h.getName() + h.getAge() + h.getSex());
        }

    }

    public static void addstudent(ArrayList<Text1> student) {

        //键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name = sc.nextLine();
        System.out.println("请输入你的年龄：");
        String age = sc.nextLine();
        System.out.println("请输入你的性别：");
        String sex = sc.nextLine();

        //创建学生对象，把录入的数据赋值给成员变量
        Text1 x = new Text1();
        x.setName(name);
        x.setAge(age);
        x.setSex(sex);

        //往集合中添加对象
        student.add(x);

    }
}
