package IoChar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayListAndFile2 {

    public static void main(String[] args) throws IOException {

        TreeSet<Student1> array = new TreeSet<Student1>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 s1, Student1 s2) {
                int num = s2.getsum() - s1.getsum();
                int num2 = num == 0 ? s1.getLanguageScores() - s2.getLanguageScores() : num;
                int num3 = num2 == 0 ? s1.getMathScores() - s2.getMathScores() : num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;
                return num4;
            }
        });

        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "名学生姓名，语文成绩，数学成绩，英语成绩并用逗号分开：");
            String s = sc.nextLine();

            //第一种办法，string变int时，不能直接用static int parseInt​(String s) 将字符串参数解析为带符号的十进制整数
            //具体原因应我也不懂
            String[] split = s.split(",");
            Student1 student = new Student1();
            student.setName(split[0]);
            Integer in = Integer.valueOf(split[1]);
            student.setLanguageScores(in.intValue());
            Integer in1 = Integer.valueOf(split[2]);
            student.setMathScores(in1.intValue());
            Integer in2 = Integer.valueOf(split[3]);
            student.setEnglishScores(in2.intValue());


            //第二种方法
           /* System.out.println("姓名：");
            String s = sc.nextLine();
            System.out.println("语文成绩：");
            int i1 = sc.nextInt();
            System.out.println("数学成绩：");
            int i2=sc.nextInt();
            System.out.println("英语成绩：");
            int i3 = sc.nextInt();

            Student1 student = new Student1();
            student.setName(s);
            student.setLanguageScores(i1);
            student.setMathScores(i2);
            student.setEnglishScores(i3);*/


            array.add(student);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("Study_test\\src\\hh.txt"));

        for (Student1 arr : array) {
            StringBuilder sb = new StringBuilder();
            sb.append(arr.getName()).append(":").append(arr.getLanguageScores()).append(",").append(arr.getMathScores()).append(",").append(arr.getEnglishScores());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
