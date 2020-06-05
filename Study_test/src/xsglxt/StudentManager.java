package xsglxt;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    public static void main(String[] args) {

        ArrayList<Student> array = new ArrayList<>();

        while (true) {
            System.out.println("---------" + "欢迎来到学生管理系统" + "---------");
            System.out.println("1  添加学生");
            System.out.println("2  删除学生");
            System.out.println("3  修改学生");
            System.out.println("4  查看所有学生");
            System.out.println("5  退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
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
                    System.out.println("谢谢使用");
                    // break;
                    System.exit(0);
            }
        }

    }

    //添加学生信息
    public static void addstudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);

        String sid;
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();

            boolean flag = isused(array, sid);
            if (flag == true) {
                System.out.println("您输入的学号已经被使用！请重新输入！");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入居住地：");
        String address = sc.nextLine();

        Student x = new Student();
        x.setSid(sid);
        x.setName(name);
        x.setAge(age);
        x.setAddress(address);

        array.add(x);

        System.out.println("添加成功!");

    }

    //查看学生信息
    public static void viewstudent(ArrayList<Student> array) {

        if (array.size() == 0) {
            System.out.println("无信息，请添加信息");
            return;
        }

        System.out.println("学号\t\t姓名\t\t年龄\t居住地");

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getAddress());
        }
    }

    //删除学生信息
    public static void removestudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("选择删除信息：");
        String sid = sc.nextLine();

        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在！请从新输入！");
        } else {
            array.remove(index);
            System.out.println("删除成功!");
        }
    }

    //修改学生信息
    public static void revisestudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("选择要修改的学生学号：");
        String sid = sc.nextLine();

        System.out.println("请输入新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入新年龄：");
        String age = sc.nextLine();
        System.out.println("请输入新居住地：");
        String address = sc.nextLine();

        Student x = new Student();
        x.setName(name);
        x.setAge(age);
        x.setAddress(address);

        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在！请从新输入！");
        } else {
            array.set(index, x);
            System.out.println("修改成功!");
        }
    }

    //判断学号是否相同
    public static boolean isused(ArrayList<Student> array, String sid) {
        boolean flag = false;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}
