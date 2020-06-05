package IoChar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AFileAndArrayList1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new FileReader("Study_test\\src\\hh.txt"));
        ArrayList<Student> array=new ArrayList<Student>();

        String line;
        while ((line=br.readLine())!=null){
            String[] sp = line.split(",");
            Student s=new Student();

            Integer i = Integer.valueOf(sp[0]);
            s.setId(i.intValue());
            s.setName(sp[1]);
            Integer i1 = Integer.valueOf(sp[2]);
            s.setAge(i1.intValue());
            s.setAddress(sp[3]);

            array.add(s);
            }

        for (Student arr : array){
            System.out.println(arr.getId()+","+arr.getName()+","+arr.getAge()+","+arr.getAddress());
        }
    }
}
