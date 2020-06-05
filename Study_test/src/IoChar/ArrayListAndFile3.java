package IoChar;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayListAndFile3 {

    public static void main(String[] args) throws IOException {

        TreeSet<Student1> students = new TreeSet<Student1>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 s1, Student1 s2) {
                int num = s1.getsum() - s2.getsum();
                int num1 = num == 0 ? s1.getLanguageScores() - s2.getLanguageScores() : num;
                int num2 = num1 == 0 ? s1.getMathScores() - s2.getMathScores() : num1;
                int i = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return i;
            }
        });

        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "个学生的信息：");
            System.out.println("姓名：");
            String s = sc.nextLine();
            System.out.println("语文成绩：");
            int i1 = sc.nextInt();
            System.out.println("数学成绩：");
            int i2 = sc.nextInt();
            System.out.println("英语成绩：");
            int i3 = sc.nextInt();

            Student1 student = new Student1();
            student.setName(s);
            student.setLanguageScores(i1);
            student.setMathScores(i2);
            student.setEnglishScores(i3);

            students.add(student);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("Study_test\\src\\hh.txt"));

        for (Student1 sdy : students) {
            StringBuilder sb = new StringBuilder();
            sb.append(sdy.getName()).append(",").append(sdy.getLanguageScores()).append(",").append(sdy.getMathScores()).append(",").append(sdy.getEnglishScores());
            String s = sb.toString();
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
