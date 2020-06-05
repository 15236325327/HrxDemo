package IoSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Study_test\\src\\hh.txt"));

        Object o = ois.readObject();

        Student s=(Student) o;
        System.out.println(s.getName()+":"+s.getAge());

        ois.close();
    }
}
