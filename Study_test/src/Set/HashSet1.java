package Set;

import java.util.HashSet;

public class HashSet1 {

    public static void main(String[] args) {

        //无序不重复
        HashSet<Student> s=new HashSet<Student>();

        Student s1=new Student("huang",21);
        Student s2=new Student("ren",22);
        Student s3=new Student("xiang",23);

        Student s4=new Student("xiang",23);

        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);

        for (Student i : s){
            System.out.println(i.getName()+i.getAge());
        }//结果：xiang23 huang21 ren22（和存储的顺序不同，且无法添加相同元素）

    }
}
