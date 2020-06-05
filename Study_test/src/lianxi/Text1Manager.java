package lianxi;

import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.util.ArrayList;
import java.util.Scanner;

public class Text1Manager {

    public static void main(String[] args) {

        ArrayList<Text1> array = new ArrayList<>();

        while (true) {
            System.out.println("---------" + "欢迎来到学生管理系统" + "---------");
            System.out.println("1  添加学生");
            System.out.println("2  删除学生");
            System.out.println("3  修改学生");
            System.out.println("4  查看所有学生");
            System.out.println("5  退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            switch (s) {
                case "1":
                    //System.out.println("添加学生");
                    addstudent(array);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    removestudent(array);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    revisestudent(array);
                    break;
                case "4":
                    //System.out.println("查看所有学生");
                    viewstudent(array);
                    break;
                case "5":
                    System.out.println("退出");
                    System.exit(0);
            }
        }
    }

    //增
    public static void addstudent(ArrayList<Text1> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生性别");
        String sex = sc.nextLine();

        Text1 x = new Text1();
        x.setName(name);
        x.setAge(age);
        x.setSex(sex);

        array.add(x);

        System.out.println("添加成功！");
    }

    //删
    public static void removestudent(ArrayList<Text1> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入将要删除的学生：");
        String name = sc.nextLine();

        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Text1 s = array.get(i);
            if (s.getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("您输入的信息有误！请重新输入！");
        } else {
            array.remove(index);
            System.out.println("删除成功！");
        }
    }

    //改
    public static void revisestudent(ArrayList<Text1> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要修改的学生：");
        String name = sc.nextLine();

        System.out.println("请输入学生新年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生新性别");
        String sex = sc.nextLine();

        Text1 x = new Text1();
        x.setName(name);
        x.setAge(age);
        x.setSex(sex);

        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Text1 s = array.get(i);
            if (s.getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("您输入的信息有误！请重新输入！");
        } else {
            array.set(index, x);
            System.out.println("修改成功！");
        }

    }

    //查
    public static void viewstudent(ArrayList<Text1> array) {

        if (array.size() == 0) {
            System.out.println("无信息！请添加信息！");
            return;
        }

        System.out.println("姓名" + "\t\t" + "年龄" + "\t" + "性别");

        for (int i = 0; i < array.size(); i++) {
            Text1 s = array.get(i);
            System.out.println(s.getName() + "\t\t" + s.getAge() + "\t" + s.getSex());
        }
    }
}
