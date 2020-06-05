package IoSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//序列化流
public class SerializationDemo {

    public static void main(String[] args) throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Study_test\\src\\hh.txt"));
        String s1="黄任翔你真帅！";

        Student s = new Student("黄任翔", 21);

        oos.writeUTF(s1);
        oos.writeObject(s);

        oos.close();
    }
}