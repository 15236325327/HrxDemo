package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTraverse {

    public static void main(String[] args) {

        Map<String, Student> s = new HashMap<String, Student>();

        Student s1 = new Student(1, "黄任翔");
        Student s2 = new Student(2, "liuyan");
        Student s3 = new Student(3, "周润发");
        Student s4 = new Student(4, "刘德华");
        Student s5 = new Student(5, "郭富城");

        s.put("001", s1);
        s.put("002", s2);
        s.put("003", s3);
        s.put("004", s4);
        s.put("005", s5);

        //遍历方式2
        Set<Map.Entry<String, Student>> s6 = s.entrySet();

        for (Map.Entry<String, Student> i : s6) {
            String key = i.getKey();
            Student value = i.getValue();
            System.out.println(key + ":" + value.getID() + "," + value.getName());
        }

        //遍历方式1
        Set<String> s7 = s.keySet();
        for (String i : s7) {
            Student s8 = s.get(i);
            System.out.println(s8.getID() + "," + s8.getName());
        }
    }
}
