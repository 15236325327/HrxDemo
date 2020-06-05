package MapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTraverse1 {

    public static void main(String[] args) {

        Map<Student2, String> s = new LinkedHashMap<Student2, String>();
        Student2 s1 = new Student2("黄任翔", 21);
        Student2 s2 = new Student2("周润发", 52);
        Student2 s3 = new Student2("刘德华", 50);
        Student2 s4 = new Student2("郭富城", 51);
        Student2 s5 = new Student2("黎明", 49);
        Student2 s6 = new Student2("黎明", 49);

        s.put(s1, "河南");
        s.put(s2, "香港");
        s.put(s3, "北京");
        s.put(s4, "上海");
        s.put(s5, "南京");
        s.put(s6, "杭州");

        //遍历方式2
        Set<Map.Entry<Student2, String>> s7 = s.entrySet();

        for (Map.Entry<Student2, String> i : s7) {
            Student2 key = i.getKey();
            String value = i.getValue();
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }//结果：黄任翔,21,河南   周润发,52,香港  刘德华,50,北京  郭富城,51,上海  黎明,49,杭州
    }
}
