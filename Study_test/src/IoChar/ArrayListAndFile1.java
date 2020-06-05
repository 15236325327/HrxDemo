package IoChar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListAndFile1 {

    public static void main(String[] args) throws IOException {

        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student(1, "刘德华", 52, "北京");
        Student s2 = new Student(2, "郭富城", 50, "西安");
        Student s3 = new Student(3, "黎明", 54, "香港");

        array.add(s1);
        array.add(s2);
        array.add(s3);

        BufferedWriter bw = new BufferedWriter(new FileWriter("Study_test\\src\\hh.txt"));

        for (Student arr : array) {

            StringBuilder sb = new StringBuilder();
            sb.append(arr.getId()).append(",").append(arr.getName()).append(",").append(arr.getAge()).append(",").append(arr.getAddress());
            String s = sb.toString();
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
