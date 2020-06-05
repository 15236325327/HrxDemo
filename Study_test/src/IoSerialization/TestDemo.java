package IoSerialization;

import java.io.*;

public class TestDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        read();
    }

    private static void read() throws IOException, ClassNotFoundException {

        //序列化
        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Study_test\\src\\hh.txt"));

        Student s = new Student("黄任翔", 21);

        oos.writeObject(s);

        oos.close();*/

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Study_test\\src\\hh.txt"));

        Object o = ois.readObject();

        Student s1 = (Student) o;
        System.out.println(s1.getName() + ":" + s1.getAge());

        ois.close();
    }
}

